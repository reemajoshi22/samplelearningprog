package com.datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseALinkedList {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("reema");
		linkedList.add("diksha");
		linkedList.add("riya");
		linkedList.add("ronit");
		linkedList.add("dennis");
		linkedList.add("mini");
		System.out.println(linkedList);
		ReverseALinkedList aLinkedList=new ReverseALinkedList();
		aLinkedList.reverse(linkedList);

	}

	private void reverse(LinkedList<String> linkedList) {

		LinkedList copyList = new LinkedList();


		LinkedListNode start = linkedList.Tail;


		while (start != null)
		{

		copyList.Add (start.Item);

		start = start.Previous;
		}

		linkedList = copyList;

		// ------------------------------------------------------------
		// That's it!
		// ------------------------------------------------------------
	}
}
