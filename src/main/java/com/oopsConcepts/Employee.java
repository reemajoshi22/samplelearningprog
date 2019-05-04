package com.oopsConcepts;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private int emp_id;
	private String dept;
	private String name;
	private int age;
	private String gender;

	public Employee() {
		super();
	}

	public Employee(int emp_id, String dept, String name, int age, String gender) {
		super();
		this.emp_id = emp_id;
		this.dept = dept;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
