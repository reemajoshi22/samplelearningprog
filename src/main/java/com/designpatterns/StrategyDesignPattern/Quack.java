package com.designpatterns.StrategyDesignPattern;

public class Quack implements QuackBehaviour {
    public void quack() {
        System.out.println("Quack");
    }
}
