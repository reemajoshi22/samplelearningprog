package com.learning;

public class Q4 {
	private void f() {
		System.out.println("private  f()");
	}

	public static void main(String[] args) {
		Q4 q4 = new Q4();
		q4.f();
	}
}

class DerviedQ4 extends Q4 {
	public void f() {
		System.out.println("public  f()");
	}
}
