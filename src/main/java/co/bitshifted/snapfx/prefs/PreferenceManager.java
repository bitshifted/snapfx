package co.bitshifted.snapfx.prefs;

import javafx.beans.property.IntegerProperty;

public interface PreferenceManager {

    IntegerPreferenceEntry getIntegerPreference(String root, String name, Integer defaultValue);

    IntegerPreferenceEntry getIntegerPreference(String name, Integer defaultValue);

    LongPreferenceEntry getLongPreference(String root, String name, Long defaultValue);

    FloatPreferenceEntry getFloatPreference(String root, String name, Float defaultValue);

    DoublePreferenceEntry getDoublePreferenceEntry(String root, String name, Double defaultValue);

    DoublePreferenceEntry getDoublePreferenceEntry(String name, Double defaultValue);

    StringPreferenceEntry getStringPreferenceEntry(String root, String name, String defaultValue);

    StringPreferenceEntry getStringPreferenceEntry(String name, String defaultValue);

    BooleanPreferenceEntry getBooleanPreferenceEntry(String root, String name, Boolean defaultValue);

    BooleanPreferenceEntry getBooleanPreferenceEntry( String name, Boolean defaultValue);

}
