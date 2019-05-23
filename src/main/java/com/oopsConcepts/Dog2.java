package com.oopsConcepts;
class Animal2 {
    public void eat() throws Exception {
        // throws an Exception
        System.out.println("eat of animal 2 which throws exception");
    }
}
public class Dog2 extends Animal2 {
    public void eat() {
        /* no Exceptions */
        System.out.println("eat of dog 2 which doesnot throws exception");
    }

    public static void main(String[] args) {
        Animal2 a = new Dog2();
        Dog2 d = new Dog2();
        d.eat(); // ok
        try {
            a.eat(); // compiler error -
        } catch (Exception e) {
            e.printStackTrace();
        }
        // unreported exception
    }
}
