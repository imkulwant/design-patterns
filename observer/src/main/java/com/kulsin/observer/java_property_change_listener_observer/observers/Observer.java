package com.kulsin.observer.java_property_change_listener_observer.observers;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Observer implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Value changed. Old value: " + evt.getOldValue() + ", New value: " + evt.getNewValue());
    }

}
