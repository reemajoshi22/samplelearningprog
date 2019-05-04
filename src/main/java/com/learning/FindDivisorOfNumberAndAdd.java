package com.learning;

import java.util.ArrayList;
import java.util.List;

public class FindDivisorOfNumberAndAdd {
	public static void main(String[] args) {
		FindDivisorOfNumberAndAdd add = new FindDivisorOfNumberAndAdd();
		List<Integer> findDivisors = add.findNum(190);
		int sumOfDigits = add.findArmStrong(190);
		System.out.println("total " + sumOfDigits);
		System.out.println(findDivisors);

		for (Integer integer : findDivisors) {
			if (integer == sumOfDigits) {
				System.out.println("found perfect number " + integer);
			}

		}
	}

	private int findArmStrong(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			sum = sum + rem;
		}
		// System.out.println(rem);
		return sum;

	}

	private List<Integer> findNum(int num) {
		List<Integer> listOfDivisors = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				listOfDivisors.add(i);
			}

		}
		return listOfDivisors;
	}
}
