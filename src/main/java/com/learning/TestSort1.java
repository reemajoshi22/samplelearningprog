package com.learning;

import java.util.*;

class TestSort1 {
	public static void main(String[] args) {
		ArrayList<Test2> stuff = new ArrayList<Test2>(); // #1
		Test2 test2=new Test2();
		test2.setA(1);
		Test2 test3=new Test2();
		test3.setA(2);
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		stuff.add(test2);
		stuff.add(test3);
		//stuff.add(2);
		System.out.println("unsorted " + stuff);
	//	Collections.sort(stuff); // #2
		System.out.println("sorted " + stuff);
		ArrayList<Double> stufff = new ArrayList<Double>(); // #1
		stufff.add(128.0);
		stufff.add(122.0);
		stufff.add(124.0);
		Collections.sort(stufff);
		System.out.println(stufff);
	}
}