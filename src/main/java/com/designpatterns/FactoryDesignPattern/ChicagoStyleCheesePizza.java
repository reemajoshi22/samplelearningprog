package com.designpatterns.FactoryDesignPattern;

public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza() {
        name="Chicago Style Deep Dish cheese pizza ";
        dough="Extra Thick crust dough ";
        sauce="Plum Tomato Sauce ";

        toppings.add("Grated Ratino Cheese");
    }

    void cut() {
        System.out.println("Cutting the Pizza in square slices ");
    }
}
