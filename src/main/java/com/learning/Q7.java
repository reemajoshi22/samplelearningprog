package com.learning;

class Outer {
	void f() {
		System.out.println("Outer.f()");
	}

	public class Inner {
		public Object outer1() {
			return Outer.this;
		}

		public Object outer2() {
			return this;
		}
	}

	public Inner inner() {
		return new Inner();
	}
}

public class Q7 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner in = outer.inner();
		System.out.println(in.outer1().getClass().getSimpleName() + " ");
		System.out.println(in.outer2().getClass().getSimpleName() + " ");
	}
}
