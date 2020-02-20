package com.designpatterns.ObserverDesignPattern.simpleObservable;


import java.util.Observable;

public class ExampleSubject extends Observable {
    int i=0;
    public ExampleSubject() {
    }
   public void setValue(int i){
    setChanged();
    notifyObservers(i);
    }
    public int getValue(){
        return i;
    }
}
