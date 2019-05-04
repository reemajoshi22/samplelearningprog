package com.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HCFLCM {
	public static void main(String[] args) {
		// lcmEulerMethod(100, b);
		findLCM(12, 16);
	}

	private static void findLCM(int i, int j) {
		int firstnumber, secondnumber;
		if (i > j) {
			firstnumber = i;
			secondnumber = j;
		} else {
			firstnumber = j;
			secondnumber = i;
		}
		List primes = findAllPrimes(firstnumber);
		System.out.println("prime numbers" + primes);
		findFactors(firstnumber, secondnumber, primes);
	}

	private static void findFactors(int firstnumber, int secondnumber,
			List primes) {
		List<Integer> numbersToBeFactored = new ArrayList<Integer>();
		List factors = new ArrayList<Integer>();
		numbersToBeFactored.add(firstnumber);
		numbersToBeFactored.add(secondnumber);
		for (int i = 0; i < primes.size(); i++) {
			int quotient = 0, j;
			System.out.println(primes.get(i));
			// divide numbersToBeFactored list with each prime
			boolean flag = true;
			while (flag) {
				boolean redo = false;

				for (j = 0; j < numbersToBeFactored.size(); j++) {

					if ((Integer) numbersToBeFactored.get(j)
							% (Integer) primes.get(i) == 0) {
						quotient = (Integer) numbersToBeFactored.get(j)
								/ (Integer) primes.get(i);
						redo = true;
						numbersToBeFactored.set(j, quotient);
						// factors.add(primes.get(i));
					}

				}
				if (!redo) {
					flag = false;
					/*
					 * numbersToBeFactored.remove(j); numbersToBeFactored.add(j,
					 * quotient);
					 */
				} else {
					factors.add(primes.get(i));

				}
				boolean allFactorsFound = true;
				for (int k = 0; k < numbersToBeFactored.size(); k++) {
					if (numbersToBeFactored.get(k) != 1) {
						allFactorsFound = false;
					}
				}

				if (allFactorsFound) {
					break;
				}
			}
		}
		int lcm = 1;
		for (int m = 0; m < factors.size(); m++) {
			lcm = lcm * (Integer) factors.get(m);
		}
		System.out.println("lcm is" + lcm);

	}

	private static List findAllPrimes(int firstnumber) {
		int count, c = 0;
		List primeNumbers = new ArrayList();
		for (int i = 2; i <= firstnumber; i++) {
			count = 2;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2) {
				// System.out.print(i + " ");
				primeNumbers.add(i);
				c++;
			}
		}
		return primeNumbers;

	}

	private static void lcmEulerMethod(int i, int j) {
		int firstnumber, secondnumber, gcd = 0, lcm = 0, gcdV = 0;
		if (i > j) {
			firstnumber = i;
			secondnumber = j;
		} else {
			firstnumber = j;
			secondnumber = i;
		}
		while (secondnumber > 0) {
			int temp = secondnumber;
			secondnumber = firstnumber % secondnumber;
			firstnumber = temp;
		}
		gcdV = secondnumber;
		try {
			lcm = (i * j) / gcdV;
		} catch (Exception e) {
			System.out.println(lcm);
		}
		System.out.println(lcm);
	}
}
