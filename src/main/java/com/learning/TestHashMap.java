package com.learning;

import java.util.HashMap;
import java.util.Map;

class Employee {
	int emp_id;
	String name;

	public Employee(int emp_id, String name) {
		this.emp_id = emp_id;
		this.name = name;

	}
}

class Address {
	int houseNo;
	String streetName;
	String city;
	int pinCode;

	public Address(int houseNo, String streetName, String city, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getAddress() {
		return houseNo + ", " + streetName + ", " + city + ", " + pinCode;

	}
}

public class TestHashMap {
	public static void main(String[] args) {
		TestHashMap hashMap=new TestHashMap();
		Employee employee = new Employee(1, "reema");
		Address address = new Address(56, "vnagar", "ambala", 133001);
		Employee employee2 = new Employee(2, "riya");
		Address address2 = new Address(59, "vnagar", "ambala", 133001);
		Map<Employee, Address> map = new HashMap<>();
		map.put(employee, address);
		map.put(employee2, address2);
		Address address3 = (Address)map.get(employee2);
		System.out.print(address3.getAddress());
	}
}
