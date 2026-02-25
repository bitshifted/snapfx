package co.bitshifted.snapfx.view;

import javafx.scene.Node;

import java.util.HashMap;
import java.util.Map;

public class ViewCache {

    private final Map<String, Node> cache = new HashMap<>();

    public Node getView(String viewName) {
        return  cache.get(viewName);
    }

    public void addView(String name, Node viewNode) {
        cache.put(name, viewNode);
    }
}
