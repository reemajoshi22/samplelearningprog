package com.designpatterns.StrategyDesignPattern;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;



    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float , even decoys !");
    }

    //  to set the duck’s behavior type through a setter method
    // on the duck subclass,
    // rather than by instantiating it in the duck’s constructor. we will now add
    // setter methods
    //We can call these methods anytime
    // we want to change the behavior of a duck on the fly
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
