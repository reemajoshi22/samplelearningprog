package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;

public class SetExample {
	public static <E> void main(String[] args) {
	/*	Set<String> s = new HashSet<String>();
		s.add("i");*/
		List<String> list =  new ArrayList<String>();;
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        
        arraylistManipultaion();
        linkelistManipulation();
		}

	private static void linkelistManipulation() {
		LinkedList<String> linkedList=new LinkedList<String>();
		StopWatch watch = StopWatch.createStarted();
		linkedList.add(0, "new");
		/*linkedList.add(1, "me");
		linkedList.add(2, "myself");*/
		System.out.println("Total time to insert data in linked list: "
				+ watch.getTime(TimeUnit.MILLISECONDS) + "ms");
		StopWatch watchRemove = StopWatch.createStarted();
		linkedList.remove(0);
		System.out.println("Total time to remove data from linked list: "
				+ watch.getTime(TimeUnit.MILLISECONDS) + "ms");
	}

	private static void arraylistManipultaion() {
		ArrayList<String> arrayList=new ArrayList<String>();
		StopWatch watch = StopWatch.createStarted();
		arrayList.add(0,"abc");
		/*arrayList.add(1, "joshi");
		arrayList.add(2, "riya");
		arrayList.add(3,"ronit");*/
		System.out.println(arrayList);
		System.out.println("Total time to insert data : "
				+ watch.getTime(TimeUnit.MILLISECONDS) + "ms");
		StopWatch watchRemove = StopWatch.createStarted();
		arrayList.remove(0);
		System.out.println("Total time to remove data : "
				+ watch.getTime(TimeUnit.MILLISECONDS) + "ms");
	}
    }

