package com.kulsin.observer.custom_implementation.observers;

import com.kulsin.observer.custom_implementation.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private float humidity = 0.0f;
    private float heatIndex = 0.0f;
    private int numReadings;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("--------------Statistics Display--------------");
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
        System.out.println("Humidity is = " + humidity);
        System.out.println("Heat index is = " + heatIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        humidity = (maxTemp / minTemp) * 100;

        heatIndex = humidity * pressure;

        display();
    }

}
