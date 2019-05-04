package com.collection;

/*Largest element gets sorted in first loop:
 * each time we compare two elements and swap if i is greater than i+1*/
import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arrayToBeSorted = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(arrayToBeSorted);
	}

	private void sort(int[] arrayToBeSorted) {
		for (int k = 0; k < (arrayToBeSorted.length - 1); k++) {
			for (int m = 0; m < (arrayToBeSorted.length - 1); m++) {
				if (arrayToBeSorted[m] > arrayToBeSorted[m + 1]) {
					int temp = arrayToBeSorted[m];
					arrayToBeSorted[m] = arrayToBeSorted[m + 1];
					arrayToBeSorted[m + 1] = temp;
				}
			}
		}
		System.out.println("sorted array" + Arrays.toString(arrayToBeSorted));
	}
}
