package com.oopsConcepts;

public class SubConstructorClass extends SuperConstructorClass {
	public SubConstructorClass() {
		//super("reema");
		System.out.println(" i am no arg constructor sub class ");
	}
	public SubConstructorClass(String string){
		super("reema");
		
	}

	public static void main(String[] args) {
		SubConstructorClass sub = new SubConstructorClass();
	}

}
