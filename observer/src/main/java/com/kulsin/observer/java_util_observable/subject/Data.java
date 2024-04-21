package com.kulsin.observer.java_util_observable.subject;

public class Data {

    private final float temperature;
    private final float humidity;
    private final float pressure;

    public Data(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
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
