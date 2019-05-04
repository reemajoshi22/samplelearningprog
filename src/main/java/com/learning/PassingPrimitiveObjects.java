package com.learning;

public class PassingPrimitiveObjects {
	public static void main(String[] args) {
		PassingPrimitiveObjects objects=new PassingPrimitiveObjects();
		Test2 test2=new Test2();
		test2.setA(2);
		System.out.println("before modify"+test2.getA());
		objects.modify(test2);
		System.out.println("after modify"+test2.getA());
	}

	private void modify(Test2 test3) {
		test3.setA(3);
	}

}
