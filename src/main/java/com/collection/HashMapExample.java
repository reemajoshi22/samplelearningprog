package com.collection;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

class Empl implements Serializable{
	transient int id;
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.id==((Empl)obj).getId()){
			return true;
		}
		else
			return false;
	}
	@Override
	public int hashCode() {
		Random random=new Random();
		int num=random.nextInt(10);
		return (id^3);
	}
}

public class HashMapExample {
	public static void main(String[] args) {

		/*
		 * HashMap<Integer,String> hm=new HashMap<Integer,String>();
		 * hm.put(100,"Amit"); hm.put(100,"Vijay"); hm.put(102,"Rahul");
		 * System.out.println(hm.get(100));
		 */
		HashMap<Empl, Integer> map = new HashMap<>();
		Empl obj = new Empl();
		obj.setId(1);
		obj.setAge(2);
		obj.setName("reema");
		map.put(obj, 1);

		Empl obj2 = new Empl();
		obj2.setId(4);
		obj2.setAge(2);
		obj2.setName("reema");
		map.put(obj2, 2);
		//System.out.println(map.put(obj2, 2));
		try {
			FileOutputStream file = new FileOutputStream(new File(
					"E:\\serializationOfMap.ser"));
			ObjectOutputStream out = new ObjectOutputStream(file);
			// Method for serialization of object
			out.writeObject(map);
			// out.defaultWriteObject();
			out.close();
			file.close();
			System.out.println("Object has been serialized using default");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		   for(Map.Entry<Empl, Integer> entry:map.entrySet()){    
		        Empl key=entry.getKey();  
		        int b=entry.getValue();  
		        //System.out.println(b+" Details:");  
		        System.out.println(key.id+" "+key.age+" "+key.name+" ");   
		    }    
		}    


	}
