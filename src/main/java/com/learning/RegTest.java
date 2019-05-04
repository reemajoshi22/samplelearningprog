package com.learning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegTest {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("abcabcabc");
		Matcher m = p.matcher("abcabcabcabcabcabcabcabcabc"); // string to search
		System.out.println("\nsource: " + "abaaaba");
		System.out.println(" index: 01234567890123456\n"); // the index
		System.out.println("expression: " + m.pattern()); // the search
															// expression
		System.out.print("match positions: "); // matches positions
		while (m.find()) {
			System.out.print(m.start() + " ");
		}
		System.out.println("");
	}
}