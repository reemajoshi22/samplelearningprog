package com.learning;

public class PassingPrimitiveVaribales {
	public static void main(String[] args) {
		int a=1;
		PassingPrimitiveVaribales passingPrimitiveVaribales=new PassingPrimitiveVaribales();
		System.out.println("before modify"+a);
		passingPrimitiveVaribales.modify(a);
		System.out.println("AFTER modify"+a);
	}

	private int modify(int a) {
		return a+1;
		
	}
}
