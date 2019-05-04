package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapInsertionRetrieval {
	public static void main(String[] args) {
		
		HashMapInsertionRetrieval hashMapInsertionRetrieval=new HashMapInsertionRetrieval();
		hashMapInsertionRetrieval.insertIntoconcurrentHashMap();
			/*Map<String, String> map = new HashMap<String, String>();
			map.put("key1", "value1");
			map.put("key2", "value2");
			map.put("key3", "value3");
			for (Map.Entry<String, String> entry : map.entrySet()) {
			    System.out.println(entry.getKey() + " = " + entry.getValue());
			    if(!map.containsKey("key4")){
			    	map.put("key4", "value4");
			    }
			}*/
			
		}

	private void insertIntoconcurrentHashMap() {
		ConcurrentHashMap<String, String> concurrentHashMap=new ConcurrentHashMap<>();
		concurrentHashMap.put("key1", "value1");
		concurrentHashMap.put("key2", "value2");
		concurrentHashMap.put("key3", "value3");
		for (Map.Entry<String, String> entry : concurrentHashMap.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		    if(!concurrentHashMap.containsKey("key4")){
		    	concurrentHashMap.put("key4", "value4");
		    }
		}
	}
	}
