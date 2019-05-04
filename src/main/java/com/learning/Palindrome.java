package com.learning;

public class Palindrome {
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		int a = 151;
		int revNum = palindrome.isPalindrome(a);
		if (revNum == a) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

	private int isPalindrome(int a) {
		int remainder;
		int rev = 0;
		while (a > 0) {
			remainder = a % 10;
			a = a / 10;
			rev = rev * 10 + remainder;

		}
		return rev;

	}
}
