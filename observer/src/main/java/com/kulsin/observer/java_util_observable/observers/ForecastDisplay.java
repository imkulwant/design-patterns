package com.kulsin.observer.java_util_observable.observers;

import com.kulsin.observer.java_util_observable.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;
    private float heatIndex;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("--------------Forecast Display--------------");
        System.out.println("Forecast conditions: " + temperature + "F degrees and " + humidity + "% humidity");
        System.out.println("Heat index is = " + heatIndex);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.heatIndex = weatherData.getPressure() / weatherData.getHumidity();
            display();
        }
    }
}
