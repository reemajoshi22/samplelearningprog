package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListReadWrite {

	public static void main(String[] args) {
		ArrayListReadWrite arrayListReadWrite =new ArrayListReadWrite();
		//arrayListReadWrite.usingArrayList();
		arrayListReadWrite.usingCopyOnWriteArrayList();

	}

	private void usingCopyOnWriteArrayList() {
		CopyOnWriteArrayList<String> arrayList=new CopyOnWriteArrayList<>();
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList.add("four");
		System.out.println("before modification "+arrayList);
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext()){
			//System.out.println(iterator.next());
			 String str = iterator.next();
			if("one".equals(str)){
				arrayList.remove(0);
			}
		}
		System.out.println("after modification "+arrayList);
	}

	private void usingArrayList() {
		List<String> list=new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			//System.out.println(iterator.next());
			 String str = iterator.next();
			if("one".equals(str)){
				list.remove(0);
			}
		}
	}

}
