package com.learning;

public class MultiInheritenceExample {
void print(){
	System.out.println("first class");
}
public static void main(String[] args) {
	child1 child2=new child2();
	child2.print();
}
}
class child1 extends MultiInheritenceExample{
	void print(){
		System.out.println("first child class");
	}
}
class child2 extends MultiInheritenceExample{
	void print(){
		System.out.println("second child class");
	}
}