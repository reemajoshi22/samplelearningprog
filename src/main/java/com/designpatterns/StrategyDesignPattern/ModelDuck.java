package com.designpatterns.StrategyDesignPattern;

// duck type
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour=new FlyNoWay();
        quackBehaviour=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am Model Duck");
    }
}
