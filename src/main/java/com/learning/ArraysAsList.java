package com.learning;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
	public static void main(String[] args) {
		ArraysAsList arraysAsList = new ArraysAsList();
		arraysAsList.asList();

	}

	private void asList() {
		String[] array = { "a", "b", "c" };
		List aslist=Arrays.asList(array);
		System.out.println(aslist.size());
		System.out.println(aslist.get(2));
		aslist.set(1,"d");
		System.out.println();
		array[1]="e";
		for(String s:array){
			System.out.println(s);
		}
		System.out.println(aslist.size());
		System.out.println(aslist);
	}
	
}
