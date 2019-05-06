package com.designpatterns.StrategyDesignPattern;

public class FlyNoWay implements FlyBehaviour {
    public void fly() {
        System.out.println("I cannot fly");
    }
}
