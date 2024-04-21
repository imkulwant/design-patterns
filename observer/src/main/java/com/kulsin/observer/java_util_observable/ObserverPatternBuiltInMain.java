package com.kulsin.observer.java_util_observable;

import com.kulsin.observer.java_util_observable.observers.CurrentConditionsDisplay;
import com.kulsin.observer.java_util_observable.observers.ForecastDisplay;
import com.kulsin.observer.java_util_observable.observers.StatisticsDisplay;
import com.kulsin.observer.java_util_observable.subject.WeatherData;

public class ObserverPatternBuiltInMain {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);

    }

}