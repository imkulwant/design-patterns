package com.kulsin.observer.java_util_observable.subject;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    // Our constructor no longer needs to create a data structure to hold Observers.
    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged(); // We now first call setChanged() to indicate the state has changed before calling notifyObservers().
        notifyObservers();// Notice we aren’t sending a data object with the notifyObservers() call. That means we’re using the PULL model.
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
