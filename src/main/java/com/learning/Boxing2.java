package com.learning;

class Boxing2 {
	static Integer x;

	public static void main(String[] args) {
		doStuff(x);
	}

	static void doStuff(Integer z) {
		int z2 = 5;
		System.out.println(z2 + z);
	}
}