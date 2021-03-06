package com.oopsConcepts;

public class Dog extends Animal1 {

	public static void main(String[] args) {
		Animal1 animal = new Dog();
		animal.eat();
		// to call bark as it is nit avail in animal ref we do downcast
		Dog dog = (Dog) animal;
		dog.bark();

		// upcasting
		Dog dog1 = new Dog();
		dog1.eat();
		dog1.bark();
		
		Animal1 animal2=(Animal1)dog1;
		animal2.eat();
	}

	public void eat() {
		System.out.println(" inside eat of dog ");
	}

	public void bark() {
		System.out.println(" dog can bark ");
	}

}
