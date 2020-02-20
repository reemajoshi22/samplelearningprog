package com.oopsConcepts;

public class SuperConstructorClass {
	public SuperConstructorClass(String string){

		System.out.println(" i am arg constructor of super class "+string);
	}
	public SuperConstructorClass(){
		this("reema");
		System.out.println(" i am no arg constructor of super class ");
	}
}
