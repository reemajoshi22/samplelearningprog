package com.sample.learning;
public class Dog {
 String name;
 Dog(String s) { name = s; }
 public static void main(String[] args) {
 Dog d1 = new Dog("Boi");
 Dog d2 = new Dog("Tyri");
 System.out.print((d1 == d2) + " ");
 Dog d3 = new Dog("Boi");
 d2 = d1;
 System.out.print((d1 == d2) + " ");
 System.out.print((d1 == d3) + " ");
 }
}