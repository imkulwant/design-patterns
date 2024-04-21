package com.kulsin.observer.custom_implementation;

import com.kulsin.observer.custom_implementation.observers.CurrentConditionsDisplay;
import com.kulsin.observer.custom_implementation.observers.ForecastDisplay;
import com.kulsin.observer.custom_implementation.observers.StatisticsDisplay;
import com.kulsin.observer.custom_implementation.subject.WeatherData;

public class ObserverPatternCustomImplMain {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);

    }

}