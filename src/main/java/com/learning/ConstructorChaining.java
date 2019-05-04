package com.learning;

public class ConstructorChaining {
	public ConstructorChaining() {
		System.out.println("base class constructor");
		instanceMethod();
		staticMethod();
	}

	public void instanceMethod() {
		System.out.println("base class insatnce method");
	}
	public  static void staticMethod() {
		System.out.println("base class static method");
	}

	public static void main(String[] args) {
		 new ConstructorChainingChild();
	}
}

class ConstructorChainingChild extends ConstructorChaining {
	public ConstructorChainingChild() {
		System.out.println("child class constructor");
		instanceMethod();
		staticMethod();
	}
	public void instanceMethod() {
		System.out.println("child class insatnce method");
	}
	public  static void staticMethod() {
		System.out.println("child class static method");
	}

}
