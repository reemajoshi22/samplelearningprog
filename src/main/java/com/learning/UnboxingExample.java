package com.learning;

public class UnboxingExample {
	void display(int i){
		System.out.println("integer unboxing"+i);
	}
	void display(Integer i){
		System.out.println("integer unboxing INTEGER"+i);
	}
	public static void main(String[] args) {
		UnboxingExample example=new UnboxingExample();
		Integer i=2;
		int i2=i+2;
		example.display(i2 );
	}

}
