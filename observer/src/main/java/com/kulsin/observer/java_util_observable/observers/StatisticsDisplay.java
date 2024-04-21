package com.kulsin.observer.java_util_observable.observers;

import com.kulsin.observer.java_util_observable.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private float humidity = 0.0f;
    private float heatIndex = 0.0f;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("--------------Statistics Display--------------");
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
        System.out.println("Humidity is = " + humidity);
        System.out.println("Heat index is = " + heatIndex);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData) o;

            float temp = data.getTemperature();
            float humidity = data.getHumidity();
            float pressure = data.getPressure();

            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            heatIndex = humidity * pressure;

            display();
        }

    }

}
