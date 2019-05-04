package com.learning;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSetExample example = new TreeSetExample();
		example.testTreeSet();
	}

	private void testTreeSet() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		TreeSet<Integer> headSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(8);
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(4);
		headSet=(TreeSet<Integer>) treeSet.headSet(8);
		Iterator iterator=headSet.iterator();
		System.out.println("Tree Set Data");
		System.out.println("first"+headSet.first());
		System.out.println("last"+headSet.last());
		System.out.println("first"+headSet.lower(4));
		System.out.println("last"+headSet.higher(5));
		System.out.println("last"+headSet.floor(5));
		System.out.println("treeset"+headSet.ceiling(2));
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}
}
