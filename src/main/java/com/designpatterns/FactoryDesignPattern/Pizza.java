package com.designpatterns.FactoryDesignPattern;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Preparing : " + name);
        System.out.println("Tossing dough : " + dough);
        System.out.println("Adding sauce  : " + sauce);
        System.out.println("Adding toppings : " );
        for (String topping : toppings) {
        }
    }
    void bake() {
        System.out.println("Bake for 25 minutes at 350 degree ");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagnoal slices ");

    }
    void box(){
        System.out.println("Place pizza in official pizza store box ");
    }
    public String getName(){
        return name;
    }
}
