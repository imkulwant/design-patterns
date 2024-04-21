package com.kulsin.observer.custom_implementation.observers;

import com.kulsin.observer.custom_implementation.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float heatIndex;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("--------------Current Conditions Display--------------");
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
        System.out.println("Heat index is = " + heatIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.heatIndex = humidity * pressure;
        display();
    }
}
