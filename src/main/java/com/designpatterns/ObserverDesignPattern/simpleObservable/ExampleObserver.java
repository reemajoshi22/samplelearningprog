package com.designpatterns.ObserverDesignPattern.simpleObservable;

import java.util.Observable;
import java.util.Observer;

public class ExampleObserver implements Observer {
    private int value;
    private Observable observable;

    public ExampleObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Value is : " + value);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        this.value = (int) arg;
        display();
        if (o instanceof ExampleSubject) {
            ExampleSubject simpleSubject = (ExampleSubject) o;
            this.value = simpleSubject.getValue();
            display();
        }

    }
}
