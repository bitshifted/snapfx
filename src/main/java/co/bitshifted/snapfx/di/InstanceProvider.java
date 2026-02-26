package co.bitshifted.snapfx.di;

import javafx.scene.Node;

/**
 * Provides managed instances present in dependency injection
 */
public interface InstanceProvider {

    /**
     * Returns an instance based on it's name and class.
     *
     * @param name name of the instance (similar to using {@code Named} annotation)
     * @param type type of the instance
     * @return instance associated with name and type. If not found, throws exception
     * @param <T> expected type of the instance
     */
    <T> T getModelDataInstance(String name, Class<T> type);

    <T> T getViewInstance(Class<T> viewClass);

    <T extends Node> T getViewRootNode(Class viewClass);
}
