package com.collection;

/*Find the middle point to divide the array into two halves:  
 Call mergeSort for first half:  
 Call mergeSort for second half:
 Merge the two halves sorted in step 2 and 3:*/
public class MergeSort {
	private int[] array;
	private int[] tempMergArr;

	public static void main(String[] args) {
		int[] arrayToBeSorted = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		int length = arrayToBeSorted.length;
		MergeSort mergeSort = new MergeSort();
		// printing first array
		int[] firstArray = mergeSort.getHalf(arrayToBeSorted, 0,
				((arrayToBeSorted.length / 2)));
		for (int k = 0; k < firstArray.length; k++) {
			System.out.println("first half (b) array is " + firstArray[k]);
		}
		int[] secondArray = mergeSort.getHalf(arrayToBeSorted,
				(arrayToBeSorted.length / 2), (arrayToBeSorted.length));

		// printing second array
		for (int k = 0; k < secondArray.length; k++) {
			System.out.println("second half (b) array is " + secondArray[k]);
		}
	}

	private int[] getHalf(int[] arrayToBeSorted, int i, int j) {
		int m = 0;
		int[] firstHalf = new int[(arrayToBeSorted.length) / 2];
		for (int k = i; k < j; k++) {
			firstHalf[m] = arrayToBeSorted[k];
			m++;
		}
		return firstHalf;

	}

	/*
	 * private void sort(int[] arrayToBeSorted, int length) { // copying first
	 * array int[] firstHalf = new int[(length) / 2]; for (int i = 0; i <
	 * (length + 1) / 2; i++) { firstHalf[i] = arrayToBeSorted[i]; } // copying
	 * second array int i = 0; int[] secondHalf = new int[(length) / 2]; for
	 * (int j = (length + 1) / 2; j < length; j++) { System.out.println("loop");
	 * secondHalf[i] = arrayToBeSorted[j]; i++; } // printing first array for
	 * (int k = 0; k < firstHalf.length; k++) {
	 * System.out.println("first half (b) array is " + firstHalf[k]); } //
	 * printing second array for (int k = 0; k < secondHalf.length; k++) {
	 * System.out.println("first half (b) array is " + secondHalf[k]); } }
	 */

}
