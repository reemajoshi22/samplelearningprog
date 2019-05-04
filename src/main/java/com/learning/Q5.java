package com.learning;
class Q5Super {
	public int field=0;
	public int getField(){
		return field;
	}
	
}
class Q5Sub extends Q5Super{
	public int field=1;
	public int getField(){
		return field;
	}
	public int getSuperField(){
		return super.getField();
	}
}
public class Q5 {
public static void main(String[] args) {
	Q5Super q5Super=new Q5Sub();
	System.out.println(q5Super.field+" "+q5Super.getField());
}
}
