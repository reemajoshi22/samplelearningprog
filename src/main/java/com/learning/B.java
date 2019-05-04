package com.learning;

public class B extends A {
	public static void display() {
		System.out.println("B");
	}
	public static void main(String[] args) {
		B b=new B();
		b.display();
		A a=new B();
		a.display();
	}
}

