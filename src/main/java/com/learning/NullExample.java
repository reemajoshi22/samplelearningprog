package com.learning;

public class NullExample {
	public static void main(String[] args) {
		Integer y = 567; // make a wrapper
		Integer x = y; 
		System.out.println(y==x);
		y++; // unwrap, use, "rewrap"
		System.out.println(x + " " + y); // print values
		System.out.println(y==x); // verify that they refer
		NullExample example=new NullExample();
		example.stringMethod(null);
		//example.intFloatmethod(1, c);
		
	}
	
	public void stringMethod(String string){
		System.out.println("string method");
	}
	public void stringMethod(Object string){
		System.out.println("object method");
	}
	
	public void intFloatmethod(int i,float f){
		System.out.println("intFloat method");
	}
//	public void intFloatmethod(float i,float f){
//		System.out.println("intFloat method");
//	}
}
