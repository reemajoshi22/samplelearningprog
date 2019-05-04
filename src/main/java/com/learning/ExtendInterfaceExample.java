package com.learning;

public class ExtendInterfaceExample implements InterfaceExample {
	int a; 
	
	public void mymethod() {
		a=InterfaceExample.ABC;
		System.out.println(a);
	}
	/*public void mymethod(){
		
	}*/
	
	public static void main(String[] args) {
		ExtendInterfaceExample example=new ExtendInterfaceExample();
		example.mymethod();
	}
	

}
