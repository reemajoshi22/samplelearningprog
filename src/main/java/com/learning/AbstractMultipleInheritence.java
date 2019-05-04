package com.learning;

public abstract class AbstractMultipleInheritence {
	abstract void print();

}

 class childclass1 extends AbstractMultipleInheritence {

	@Override
	void print() {
		System.out.println("child class1");
		
	}
}
 
 class childclass2 extends AbstractMultipleInheritence {

		@Override
		void print() {
			System.out.println("child class2");
			
		}
	}
 class childclass  extends childclass1,childclass2{
	 
 }
