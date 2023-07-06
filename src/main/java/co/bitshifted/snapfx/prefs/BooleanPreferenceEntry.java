package co.bitshifted.snapfx.prefs;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.prefs.Preferences;

public class BooleanPreferenceEntry extends BasePreferenceEntry<Boolean> {

    public BooleanPreferenceEntry(String root, String name, Boolean defaultValue){
        super(root, name, defaultValue);
    }


    @Override
    protected Property<Boolean> createProperty(Boolean defaultValue) {
        return new SimpleBooleanProperty(defaultValue);
    }

    @Override
    protected void doSave() {
        baseNode.putBoolean(name, property.getValue());
    }

    @Override
    protected void doSave(Boolean value) {
        baseNode.putBoolean(name, value);
    }

}
