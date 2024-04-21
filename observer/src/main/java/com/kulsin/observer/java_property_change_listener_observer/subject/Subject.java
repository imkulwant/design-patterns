package com.kulsin.observer.java_property_change_listener_observer.subject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Subject {

    private int value;
    private PropertyChangeSupport support;

    public Subject() {
        this.support = new PropertyChangeSupport(this);
    }

    public void setValue(int value) {
        int oldValue = this.value;
        this.value = value;
        support.firePropertyChange("value", oldValue, value);
    }

    public int getValue() {
        return value;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

}
