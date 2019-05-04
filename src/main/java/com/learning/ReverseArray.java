package com.learning;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		ReverseArray reverseArray = new ReverseArray();
		reverseArray.reverseArrayOfInt(array);

	}

	private void reverseArrayOfInt(int[] array) {
		int secondArray[] = new int[array.length];
		for (int element : array) {
			System.out.println(element);
		}
		for (int i = 0; i < array.length; i++) {
			secondArray[i] = array[array.length - i - 1];

		}
		for (int secondElement : secondArray) {
			System.out.println(secondElement);
		}
	}
}
