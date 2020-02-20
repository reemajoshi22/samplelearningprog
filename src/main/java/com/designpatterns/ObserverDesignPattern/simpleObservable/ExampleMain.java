package com.designpatterns.ObserverDesignPattern.simpleObservable;

public class ExampleMain {
    public static void main(String[] args) {
        ExampleSubject exampleSubject=new ExampleSubject();
        ExampleObserver exampleObserver=new ExampleObserver(exampleSubject);
        exampleSubject.setValue(2);

    }
}
