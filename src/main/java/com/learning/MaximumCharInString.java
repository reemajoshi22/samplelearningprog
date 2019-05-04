package com.learning;

public class MaximumCharInString {

	public static void main(String[] args) {
		String str = "aabbccdddeeeeefffff";
		MaximumCharInString charInString = new MaximumCharInString();

		charInString.findMax(str);

	}

	private void findMax(String str) {
		char maxChar = 0;
		int count = 1;
		int max = 0;
		char[] charArray = str.toCharArray();
		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i] == charArray[i - 1]) {
				count++;
			} else {
				if (count > max) {
					max = count;
					maxChar = charArray[i - 1];
				}
				count = 1;
			}
		}
		if (count > max) {
			max = count;
			maxChar = charArray[charArray.length - 1];
		}
		System.out.println("max char is " + maxChar);
	}
}
