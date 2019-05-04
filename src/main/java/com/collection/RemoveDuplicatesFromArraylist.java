package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArraylist {
	public static void main(String[] args) {
		RemoveDuplicatesFromArraylist arraylist = new RemoveDuplicatesFromArraylist();
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("reema");
		arraylist1.add("reema");
		arraylist1.add("joshi");
		arraylist1.add("joshi");
		System.out.println(arraylist1.size());
		System.out.println(arraylist1);

		arraylist.removeWithoutInsertionOder(arraylist1);
		arraylist.removeWithInsertionOder(arraylist1);
		arraylist.removeWithoutUsingSet(arraylist1);

	}

	private void removeWithoutUsingSet(ArrayList<String> arraylist1) {
		// arrayList2.addAll(arraylist1);
		// System.out.println(arrayList2);
		for (int i = 0; i < arraylist1.size(); i++) {
			for (int j = i + 1; j < arraylist1.size(); j++) {
				if (arraylist1.get(i).equals(arraylist1.get(j))) {
					arraylist1.remove(j);
				}

			}
		}
		System.out.println(" without using set " + arraylist1);
	}

	private void removeWithInsertionOder(ArrayList<String> arraylist1) {

		LinkedHashSet<String> hashSet = new LinkedHashSet<String>(arraylist1);

		// creating arraylist
		ArrayList<String> arraylistWithoutDup = new ArrayList<String>(hashSet);
		System.out.println(arraylistWithoutDup.size());
		System.out.println(arraylistWithoutDup);

	}

	private void removeWithoutInsertionOder(ArrayList<String> arraylist1) {

		HashSet<String> hashSet = new HashSet<String>(arraylist1);

		ArrayList<String> arrayList = new ArrayList<String>(hashSet);

		System.out.println(arrayList.size());
		System.out.println(arrayList);

	}
}
