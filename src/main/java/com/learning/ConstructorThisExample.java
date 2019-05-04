package com.learning;

public class ConstructorThisExample {
public static void main(String[] args) {
	OneB b=new OneB();
	//OneA b1=new OneA(b);
}
}
class OneA{
	OneA(OneB b){
		b.display();
		
	}
	public void display() {
		System.out.println("i am display of A");
	}
}
class OneB{
	OneB(){
		new OneA(this);
	}

	public void display() {
		System.out.println("i am display of B");
	}
	
}
