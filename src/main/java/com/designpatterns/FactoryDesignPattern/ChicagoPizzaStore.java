package com.designpatterns.FactoryDesignPattern;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        return null;}
    }
