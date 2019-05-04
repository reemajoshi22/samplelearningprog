package com.learning;

public class StaticNonStaticExample {
	static int a = 1;

	public static void main(String[] args) {
		StaticNonStaticExample example = new StaticNonStaticExample();
		System.out.println(StaticNonStaticExample.a);
	}
}
