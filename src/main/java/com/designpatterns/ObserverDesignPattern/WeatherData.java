package com.designpatterns.ObserverDesignPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;


    float temp;
    float humidity;
    float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }

    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temp, humidity, pressure);
        }

    }

    public void measurementsChanged() {
        notifyObserver();
    }
    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();

    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
