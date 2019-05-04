package com.learning;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample implements Comparable<ComparableExample> {
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
		return "[id-" + this.emp_id + ",name-" + this.name + ",dept-" + dept
				+ "]";
	}

	public static void main(String[] args) {
		ComparableExample comparableExample = new ComparableExample();
		comparableExample.setEmp_id(3);
		comparableExample.setName("reema");
		comparableExample.setDept("cse");
		System.out.println(comparableExample.toString());

		ComparableExample comparableExample2 = new ComparableExample();
		comparableExample2.setEmp_id(2);
		comparableExample2.setName("riya");
		comparableExample2.setDept("biotech");
		System.out.println(comparableExample2.toString());

		ComparableExample comparableExample3 = new ComparableExample();
		comparableExample3.setEmp_id(1);
		comparableExample3.setName("sippy");
		comparableExample3.setDept("biotech");

		ComparableExample comparableExample4 = new ComparableExample();
		comparableExample4.setEmp_id(8);
		comparableExample4.setName("kay");
		comparableExample4.setDept("biotech");

		ComparableExample comparableExample5 = new ComparableExample();
		comparableExample5.setEmp_id(50);
		comparableExample5.setName("hay");
		comparableExample5.setDept("biotech");

		ArrayList<ComparableExample> arrayList = new ArrayList<ComparableExample>();
		arrayList.add(comparableExample);
		arrayList.add(comparableExample2);
		arrayList.add(comparableExample3);
		arrayList.add(comparableExample4);
		arrayList.add(comparableExample5);
		Collections.sort(arrayList);
		System.out.println("after sorting "+arrayList);

	}

	@Override
	public int compareTo(ComparableExample o) {
		//return (this.emp_id - o.emp_id);// comparing based upon emp id
		// comparing based upon emp name
		return name.compareTo(o.name);
	}

}
