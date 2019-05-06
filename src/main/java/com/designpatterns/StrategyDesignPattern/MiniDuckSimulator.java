package com.designpatterns.StrategyDesignPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck=new MallardDuck();
        duck.performQuack();
        duck.performFly();

        Duck model=new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();


        // first call to performFly() delegates to the flyBehaviour object set in
        // ModelDuck's Construcor which is FlyNoWay
        // second call invokes the model's inherited behaviour setter.
    }
}
