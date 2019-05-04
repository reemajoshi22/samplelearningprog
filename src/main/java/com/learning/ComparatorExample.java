package com.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
	int emp_id;
	String name;
	String dept;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "[id-"+this.emp_id+",name-"+this.name+",dept-"+dept+"]";
	}
	/*public static void main(String[] args) {
		ComparatorExample comparableExample=new ComparatorExample();
		comparableExample.setEmp_id(3);
		comparableExample.setName("reema");
		comparableExample.setDept("cse");
		System.out.println(comparableExample.toString());
		
		ComparatorExample comparableExample2=new ComparatorExample();
		comparableExample2.setEmp_id(2);
		comparableExample2.setName("riya");
		comparableExample2.setDept("biotech");
		System.out.println(comparableExample2.toString());
		
		ComparatorExample comparableExample3=new ComparatorExample();
		comparableExample3.setEmp_id(1);
		comparableExample3.setName("sippy");
		comparableExample3.setDept("biotech");
		
		
		ComparatorExample comparableExample4=new ComparatorExample();
		comparableExample4.setEmp_id(8);
		comparableExample4.setName("kay");
		comparableExample4.setDept("biotech");
		
		ComparatorExample comparableExample5=new ComparatorExample();
		comparableExample5.setEmp_id(50);
		comparableExample5.setName("hay");
		comparableExample5.setDept("biotech");
		
		
		ArrayList<ComparatorExample> arrayList=new ArrayList<ComparatorExample>();
		arrayList.add(comparableExample);
		arrayList.add(comparableExample2);
		arrayList.add(comparableExample3);
		arrayList.add(comparableExample4);
		arrayList.add(comparableExample5);
		System.out.println(arrayList);
		
	}*/

//	@Override
//	public int compare(ComparatorExample o1, ComparatorExample o2) {
//		return (o1.emp_id-o2.emp_id);
//	}


}
