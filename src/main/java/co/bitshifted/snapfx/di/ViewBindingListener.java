package co.bitshifted.snapfx.di;

import co.bitshifted.snapfx.annotations.FxView;
import co.bitshifted.snapfx.view.FxViewAware;
import co.bitshifted.snapfx.view.FxViewLoader;
import co.bitshifted.snapfx.view.ViewCache;
import com.google.inject.Inject;
import com.google.inject.spi.ProvisionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ViewBindingListener implements ProvisionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(ViewBindingListener.class);

    @Inject
    private FxViewLoader viewLoader;
    @Inject
    private ViewCache viewCache;


    @Override
    public void onProvision(ProvisionInvocation provision) {
        var provisionedObject = provision.provision();
        var annotation = provisionedObject.getClass().getAnnotation(FxView.class);
        String viewName = null;
        if(provisionedObject instanceof FxViewAware viewAware) {
            viewName = viewAware.viewName();
        } else if(annotation != null) {
            viewName = annotation.name();
        }
        if(viewName != null) {
            var node = viewLoader.loadView(provisionedObject);
            viewCache.addView(viewName, node);
            LOGGER.debug("Cached view: {}", provisionedObject.getClass().getName());
        }


    }
}
