package com.designpatterns.StrategyDesignPattern;
// Duck Type
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour=new Quack();
        flyBehaviour=new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a Mallard Duck");
    }
}
