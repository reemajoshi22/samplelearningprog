package com.learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindNonRepeatedCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string :");

		String input = sc.next();
		FindNonRepeatedCharInString findNonRepeatedCharInString = new FindNonRepeatedCharInString();
		 findNonRepeatedCharInString.firstRepeatedNonRepeatedChar(input);
		 findNonRepeatedCharInString.AllRepeatedChar(input);
		findNonRepeatedCharInString.CountOccurenes(input);
		findNonRepeatedCharInString.usingSet(input);
	}

	private void usingSet(String input) {
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		 
        HashSet<String> set = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }		
	}

	private void CountOccurenes(String input) {
		char[] strArray = input.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < strArray.length; i++) {

			if (hashMap.containsKey(strArray[i])) {
				hashMap.put(strArray[i], hashMap.get(strArray[i]) + 1);
			} else {
				hashMap.put(strArray[i], 1);
			}

		}
		System.out.println("number of occurences are "
				+ Arrays.asList(hashMap));
	}

	private void AllRepeatedChar(String input) {
		char[] strArray = input.toCharArray();
		HashMap<Integer, Character> hashMap = new HashMap<Integer, Character>();
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					// found = true;
					hashMap.put(i, strArray[i]);
				}
			}
		}
		System.out.println("All Repeated characters are "
				+ Arrays.asList(hashMap));

	}

	private void firstRepeatedNonRepeatedChar(String input) {
		char[] strArray = input.toCharArray();
		char repeatedChar = 0;
		boolean found = false;
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					found = true;
					break;
				}
			}
			if (found == true) {
				repeatedChar = strArray[i];
				break;
			}
		}
		System.out.println("Repeated character is " + repeatedChar);
	}
}
