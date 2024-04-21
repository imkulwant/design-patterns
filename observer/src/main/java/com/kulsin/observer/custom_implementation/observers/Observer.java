package com.kulsin.observer.custom_implementation.observers;

/**
 * The Observer interface is implemented by all observers,
 * so they all have to implement the update() method.
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);

}
