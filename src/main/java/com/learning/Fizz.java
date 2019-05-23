package com.learning;

import java.util.Arrays;

class Fizz {
	int x = 5;

	public static void main(String[] args) {
		final Fizz f1 = new Fizz();
		Fizz f2 = new Fizz();
		Fizz f3 = FizzSwitch(f1, f2);
		System.out.println((f1 == f3) + " " + (f1.x == f3.x));
		String str = "PANKAJ";
		byte[] byteArr = str.getBytes();
		// print the byte[] elements
		String strr=new String(byteArr);
		System.out.println("String to byte array: " + Arrays.toString(byteArr));
		System.out.println("byte array to string is :" + strr);
	}

	static Fizz FizzSwitch(Fizz x, Fizz y) {
		final Fizz z = x;
		z.x = 6;
		return z;
	}
}