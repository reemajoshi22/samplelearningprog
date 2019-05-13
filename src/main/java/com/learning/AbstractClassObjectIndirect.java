package com.learning;

 abstract class AbstractClassExample{
     public void display(){
         System.out.println("Display of AbstractClassExample");
     }

}
public class AbstractClassObjectIndirect extends  AbstractClassExample{
    public static void main(String[] args) {
        AbstractClassExample abstractClassExample=new AbstractClassExample();
    }
}
