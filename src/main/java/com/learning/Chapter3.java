package com.learning;

public class Chapter3 {
	String year;
	public static void main(String[] args) {
		//Chapter3 chapter3;
		int x = 0;
		/*if(args[0]!=null){
			int y=x;
			System.out.println(y);
		}*/
		Chapter3 chapter3 = new Chapter3();
		chapter3.showYear();
		Test2 test2=new Test2();
		test2.setA(2);
		chapter3.acceptTest2Object(test2);
		System.out.println(test2.getA());
	}
	private static void acceptTest2Object(Test2 test2SecondObject) {
		test2SecondObject.setA(3);
		System.out.println("method "+test2SecondObject.getA());
	}
	private void showYear() {
		 String x = "Java"; // Assign a value to x
		 String y = x; // Now y and x refer to the same
		 // String object
		 System.out.println("y string = " + y);
		 x = x + " Bean"; // Now modify the object using
		 // the x reference
		 System.out.println("x string = " + x);
		 System.out.println("y string = " + y);
		 String s = "abc";
		 String t = s; // Now t and s refer to the same
		  // String object
		System.out.println(t.toUpperCase()); 
		System.out.println(s);
		/*String a = "abc";*/
		String a = new String("abc");
		/*String b = "abc";*/
		String b = new String("abc");
		System.out.println("COMAPRE D"+a==b);
		System.out.println("COMAPRE equals D"+a.equals(b));
		Double d1=100.10;
		Double d2=100.10;
		System.out.println("captital D"+d1.equals(d2));
		int i1=2;
		int i2=i1;
		i1++;
		System.out.println("small i == "+(i1==i2));
		Integer i3=2;
		Integer i4=new Integer(3);
		System.out.println("capital i == "+(i3==i4));
		System.out.println("capital i"+i3.equals(i4));
		float f1=100.1f;
		float f2=100.1f;
		long[] array = new long[10];
		System.out.println(array[1]);
		System.out.println(f1==f2);
		System.out.println(i1==i2);
		System.out.println(a==b);
		System.out.println("double values"+(d1==d2));
		System.out.println(year);
		Integer i6 = 1000;
		Integer i7 = 1000;
		if(i6==i7) System.out.println("different objects");
		if(i6.equals(i7)) System.out.println("meaningfully equal");
		Integer i8 = 10;
		Integer i9 = 10;
		if(i8 != i9) System.out.println("same object");
		if(i3.equals(i4)) System.out.println("meaningfully equal");
		String s8 = "abc";
		String s9 = "abc";
		if(s8 == s9) System.out.println("SAME object");
		if(s8.equals(s9)) System.out.println("Meaningfully equal");
		
	}
	void display(){}
}
