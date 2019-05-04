package com.learning;
class Q6Super{
	public static String staticGet(){
		return "base-staticGet()";
		
	}
	public static String get(){
		return "base-Get()";
		
	}
}
class Q6Sub extends Q6Super{
	public static String staticGet(){
		return "dervied-staticGet()";
		
	}
	public static String get(){
		return "dervied-Get()";
		
	}
}

public class Q6 {
public static void main(String[] args) {
	Q6Super q6Super=new Q6Sub();
	System.out.println(q6Super.staticGet()+" ");
	System.out.println(q6Super.get()+" ");
}
}
