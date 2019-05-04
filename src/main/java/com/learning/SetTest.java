package com.learning;

import java.util.*;

class SetTest {
	public static void main(String[] args) {
		boolean[] ba = new boolean[5];
		Set s = new TreeSet(); 
		ba[0] = s.add("a");
		ba[1] = s.add("v");
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add("m");
		for (int x = 0; x < ba.length; x++)
			System.out.print(ba[x] + " ");
		System.out.println();
		for (Object o : s)
			System.out.print(o + " ");
	}
}