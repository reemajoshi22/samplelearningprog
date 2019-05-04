package com.learning;

public class ShadowStatic {
	static int a=7;
	public static void main(String[] args) {
		ShadowStatic shadowStatic=new ShadowStatic();
		System.out.println("before modify"+a);
		shadowStatic.modify(a);
		System.out.println(a);
	}
	private int modify(int a2) {
		return a2+200;
	}
}
