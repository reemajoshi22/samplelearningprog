package com.oopsConcepts;

public class OverridingStaticRules {
    public static void staticMethod(){
        System.out.println("Base class static method");
    }
    public  void nonStaticMethod(){
        System.out.println("base class non-static method");
    }
}
class derivedClass extends OverridingStaticRules{
    // cannot override static method
    public  void staticMethod(){
        System.out.println("Base class static method");
    }
    public static  void nonStaticMethod(){
        System.out.println("base class non-static method");
    }
}
