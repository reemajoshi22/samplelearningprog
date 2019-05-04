package com.learning;

public class AutoBoxingExample {
	void display(Integer i) {
		System.out.println("autoboxing "+i);
	}
	void display(int i) {
		System.out.println("autoboxing int"+i);
	}

	public static void main(String[] args) {
		AutoBoxingExample autoBoxingExample=new AutoBoxingExample();
		autoBoxingExample.display(1);
	}
}
