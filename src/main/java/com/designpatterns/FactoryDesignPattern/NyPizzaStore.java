package com.designpatterns.FactoryDesignPattern;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese"))
        return new NYStyleCheesePizza();
    return null;}
}
