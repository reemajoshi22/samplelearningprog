package com.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class DeseralizeHashMap {
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(new File(
					"E:\\serializationOfMap.ser"));
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			HashMap<Empl, Integer> map = (HashMap) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			for(Map.Entry<Empl, Integer> entry:map.entrySet()){    
		        Empl key=entry.getKey();  
		        int b=entry.getValue();  
		        //System.out.println(b+" Details:");  
		        System.out.println(key.id+" "+key.age+" "+key.name+" ");   
		    }    
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
