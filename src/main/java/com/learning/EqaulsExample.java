package com.learning;

public class EqaulsExample {
	public static void main(String[] args) {
		EqaulsExample eqaulsExample=new EqaulsExample();
		eqaulsExample.compareString();
	}

	private void compareString() {
		String s1="abc";
		String s2="abc";
		System.out.println("s1 using ="+(s1==s2));
		System.out.println("s1 using equals"+(s1.equals(s2)));
		String s3="abc";
		String s4=new String("abc");
		System.out.println("s3 using ="+(s3==s4));
		System.out.println("s3 using equals"+(s3.equals(s4)));
		String s5=new String("abc");
		String s6=new String("abc");
		System.out.println("s5 using ="+(s5==s6));
		System.out.println("s5 using equals"+(s5.equals(s6)));
	}
}
