package com.kulsin.observer.java_property_change_listener_observer;

import com.kulsin.observer.java_property_change_listener_observer.observers.Observer;
import com.kulsin.observer.java_property_change_listener_observer.subject.Subject;
import com.kulsin.observer.java_util_observable.observers.CurrentConditionsDisplay;
import com.kulsin.observer.java_util_observable.observers.ForecastDisplay;
import com.kulsin.observer.java_util_observable.observers.StatisticsDisplay;
import com.kulsin.observer.java_util_observable.subject.WeatherData;

public class ObserverPatternPropertyChangeListenerMain {

    public static void main(String[] args) {

        Subject subject = new Subject();
        Observer observer = new Observer();

        subject.addPropertyChangeListener(observer);

        // Simulate a value change
        subject.setValue(10);

        // Remove observer
        subject.removePropertyChangeListener(observer);

        // Simulate another value change
        subject.setValue(20);

    }

}