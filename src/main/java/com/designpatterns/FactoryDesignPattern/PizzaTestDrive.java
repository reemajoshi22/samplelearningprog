package com.designpatterns.FactoryDesignPattern;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore=new NyPizzaStore();
        PizzaStore chicago=new ChicagoPizzaStore();

        Pizza pizza=pizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a pizza "+pizza.getName()+" ");

        pizza=chicago.orderPizza("cheese");
        System.out.println("Joel ordered a pizza "+pizza.getName()+" ");
    }
}
