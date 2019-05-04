package com.learning;

/*
 * Copyright (c) 2018.
 * All Rights Reserved.
 */



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 */
public class LowestCommonFactor {

    public static void main(String[] args) {
        long startAt = System.currentTimeMillis();
        int lcm = new LowestCommonFactor().find(15, 200,40,80);
        System.out.println(" Common Lowest Factor : " + lcm);
        System.out.println("time taken : " + TimeUnit.MILLISECONDS.toMillis(System.currentTimeMillis() - startAt));

    }

    public int find(int... integers) {
        // get largest number
        int largestNumber = integers[0];
        for (int i = 1; i < integers.length; i++) {
            if (integers[i] > largestNumber) {
                largestNumber = integers[i];
            }
        }

        //find all primes of largest number
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < largestNumber; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; ++j) {
                // condition for prime number
                if (i % j == 0) {
                    //not a prime
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }

        //
        List<Integer> factors = new ArrayList<>();
        for (int i = 0; i < primes.size(); i++) {
            int primeFactor = primes.get(i);
            boolean keepRunning = true;
            while (keepRunning) {
                boolean factorFound = false;
                for (int j = 0; j < integers.length; j++) {
                    int number = integers[j];
                    if (number % primeFactor == 0) {
                        integers[j] = number / primeFactor;
                        factorFound = true;

                    }
                }

                if (!factorFound) {
                    keepRunning = false;
                }else {
                    factors.add(primeFactor);
                }
            }

            boolean allFactorsFound = true;
            for (int j = 0; j < integers.length; j++) {
                if (integers[j] != 1) {
                    allFactorsFound = false;
                }
            }

            if (allFactorsFound) {
                break;
            }
        }

        //
        int lcm = 1;
        for (int i = 0; i < factors.size(); i++) {
            lcm = lcm * factors.get(i);
        }


        return lcm;
    }
}
