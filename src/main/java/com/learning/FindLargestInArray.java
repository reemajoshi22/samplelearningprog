package com.learning;

public class FindLargestInArray {
	static int[] arrayInput = { 1, 2, 10, 8, 9 };

	public static void main(String[] args) {
		FindLargestInArray array = new FindLargestInArray();
		int largest = array.findLargest(arrayInput);
		int secondLarget = array.findSecondLargest(largest, arrayInput);
		final int a = 1;
		final int b;
		b = 2;
		int x = 0;
		switch (x) {
		 case a: // ok
		 case b: // compiler error
		}
	}

	private int findSecondLargest(int largest, int[] arrayInput2) {

		return 0;
	}

	private int findLargest(int[] arrayInput2) {
		int largest = arrayInput2[0];
		for (int i = 0; i < arrayInput2.length; i++) {
			if (arrayInput2[i] > largest) {
				largest = arrayInput2[i];
			}
		}
		System.out.println("largest is " + largest);
		return largest;
	}

}