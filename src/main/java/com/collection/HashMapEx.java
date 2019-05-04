package com.collection;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		Emplo emplo=new Emplo();
		emplo.setAge(18);
		emplo.setName("first");
		Emplo emplo2=new Emplo();
		emplo2.setAge(18);
		emplo2.setName("first");
		
		HashMap<Emplo, Integer> map=new  HashMap<>();
		map.put(emplo, 1);
		map.put(emplo, 5);
		System.out.println(map.get(emplo));

	}

}

class Emplo {
	int age;
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
