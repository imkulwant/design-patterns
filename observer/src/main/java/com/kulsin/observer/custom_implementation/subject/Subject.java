package com.kulsin.observer.custom_implementation.subject;

import com.kulsin.observer.custom_implementation.observers.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    /**
     * This method is called to notify all observers when the Subject’s state has changed.
     */
    void notifyObservers();
}
