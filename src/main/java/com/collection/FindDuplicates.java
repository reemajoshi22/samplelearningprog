package com.collection;

/*Suppose you want to know which words in the argument list 
 * occur only once and which occur more than once, 
 * but you do not want any duplicates printed out repeatedly.
 *  This effect can be achieved by generating two sets —
 *   one containing every word in the argument list and the other containing only the duplicates. 
 *   The words that occur only once are the set difference of these two sets, which we know how to compute*/
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
	public static void main(String[] args) {
		Set<String> uniques = new HashSet<String>();
		uniques.add("i");
		uniques.add("am");
		uniques.add("reema");
		uniques.add("i");
		Set<String> dups = new HashSet<String>();
		dups.add("i");
		dups.add("am");
		dups.add("rock");
		uniques.retainAll(dups);
		System.out.println("common to both"+uniques);
		for (String a : dups)
			if (!uniques.add(a))
				dups.add(a);
		System.out.println("elements occuring only one time in both sets"
				+ uniques);
		System.out.println("elements in duplicate"+dups);
		uniques.retainAll(dups);
		System.out.println("after retain"+uniques);
		/*
		 * System.out.println("dups"+dups); // Destructive set-difference
		 * System.out.println("uniques before removing"+uniques);
		 * uniques.removeAll(dups);
		 * 
		 * System.out.println("Unique words:    " + uniques);
		 * System.out.println("Duplicate words: " + dups);
		 */
	}

}
