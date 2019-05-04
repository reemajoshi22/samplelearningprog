package com.learning;

import java.util.Arrays;
import java.util.Stack;


public class Reverse {
	public static void main(String[] args) {
		int i = 734;
		String s = "reema";
		String s2 = "5+6*7-60";
		reverseANumber(i);
		reverseString(s);
		reverseExpression(s2);
	}

	private static void reverseExpression(String s2) {
		//String[] values = s2.split("[-+*/]");
		String[] values = s2.split("[+*-]");
		String[] operators = {"-","*","+"};
		String[] reversedExpression = new String[values.length];
		int len=values.length;
		for (int i = 0; i < len; i++) {
			reversedExpression[i] =values[(len-i-1)];
			//reversedExpression[i] = values.charAt((len - i - 1));
		}
		pushOnStack(values,operators);
		//String s3 = String.valueOf(reversedExpression);
		/*reversedExpression[1] = s3.charAt(0);
		reversedExpression[0] = s3.charAt(1);*/
		//String s=reversedExpression.toString();
		System.out.println(Arrays.toString(reversedExpression));

	}

	private static void pushOnStack(String[] values, String[] operators) {
		Stack stack=new Stack<>();
		stack.push(values[0]);
		stack.push(operators[0]);
		stack.push(values[1]);
	}

	private static void reverseString(String s) {
		char[] reversedString = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			reversedString[i] = s.charAt((s.length() - i - 1));
		}
		System.out.println(String.valueOf(reversedString));
	}

	private static void reverseANumber(int number) {
		while (number > 0) {
			int reversedNumber = 0;
			int remainder = number % 10;
			number = number / 10;
			reversedNumber = reversedNumber * 10 + remainder;
			System.out.println(reversedNumber);
		}
	}

}
