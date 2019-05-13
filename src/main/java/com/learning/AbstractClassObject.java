package com.learning;

class OneExt extends AbstractClassObject{

    @Override
    public void abstractClassMethod() {
        System.out.println("definition of abstract class method in OneExt");
    }
}
public abstract class AbstractClassObject {
    public abstract void abstractClassMethod();

    public static void main(String[] args) {
        AbstractClassObject abstractClassObject=new AbstractClassObject();
    }
}
