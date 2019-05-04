package com.learning;

import java.util.ArrayList;
import java.util.List;

public class RemoveFromCollection {
	public void removeFromCollection(List<Integer> marks) {
		/*
		 * for (Integer mark : marks) { if (mark < 40) marks.remove(mark); //
		 * ==> Will throw // java.util.ConcurrentModificationException }
		 */
		/*
		 * for (Iterator<Integer> iterator = marks.iterator();
		 * iterator.hasNext(); ) { Integer mark = iterator.next(); if (mark <
		 * 40) iterator.remove(); //==> Safe to call remove() on Iterator
		 * System.out.println("element removed"); }
		 */
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		// test.removeFromCollection(list);
		/*
		 * Iterator<Integer> iterator = list.iterator(); while
		 * (iterator.hasNext()) { //System.out.println(iterator.next()); if
		 * (iterator.next() < 40) { iterator.remove();
		 * System.out.println("element removed"); } }
		 */
		for (Integer integer : list) {
			if (integer < 40) {
				list.remove(integer);
				System.out.println("elements removed");
			}
		}
	}
}
