package com.learning;

import java.util.HashMap;

public class Chapter4 {
	public static void main(String[] args) {
		/*if(args.length == 1 | args[1].equals("test")) {
			 System.out.println("test case");
			 } else {
			 System.out.println("production " + args[0]);
			 }
			*/
		HashMap<String, String> hashMap=new HashMap<String, String>();
		hashMap.put("1", "reema");
		hashMap.put("1", "riya");
		System.out.println(hashMap.get(1));
		eqaulOperator();
	}

	private static void eqaulOperator() {
		System.out.println("char 'a' == 'a'? " + ('a' == 'a'));
		System.out.println("char 'a' == 'b'? " + ('a' == 'b'));
		System.out.println("5 != 6? " + (5 != 6));
		System.out.println("5.0 == 5L? " + (5.0 == 5L));
		System.out.println("true == false? " + (true == false));
		String s1 = new String("abc");
		String s2 = new String("ABC");
		String s3 = new String("abc");
		String s4 = new String("abc");
		String s5="string";
		int i1=2;
		int i3=6;
		String i2=s5+i1+i3;
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s3.equals(s4));
		System.out.println(i2);
		byte b1 = 6 & 8;
		byte b2 = 7 | 9;
		byte b3 = 5 ^ 4;
		int z = 5;
		if(++z > 5 || ++z > 6) z++; 
		System.out.println(z);
		System.out.println(b1 + " " + b2 + " " + b3);
		System.out.println("xor " + ((2 < 3) ^ (4 > 3)));
		int i = 42;
		 String s = (i<40)?"life":(i>50)?"universe":"everything";
		 System.out.println(s);
		if(s4 instanceof String){
			System.out.println("s4 is instance if string");
		}

	}
}
