package com.learning;

class OneToBeExtended{
    public void display(){
        System.out.println("OneToBeExtended");
    }
}
class TwoToBeExtended{
    public void display(){
        System.out.println("TwoToBeExtended");
    }
}

public abstract class MultipleInheritenceExample extends OneToBeExtended,TwoToBeExtended{
}
