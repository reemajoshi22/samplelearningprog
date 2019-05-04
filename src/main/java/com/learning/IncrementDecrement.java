package com.learning;

public class IncrementDecrement {
	public static void main(String[] args) {
		int a=8;
		a=--a+a--+a++;
		System.out.println(a );
		int j=5;
		IncrementDecrement decrement=new IncrementDecrement();
		decrement.printIntValue(j);
		System.out.println("j "+j);
		decrement.printIntValue(j++);
		System.out.println("j "+j);
		decrement.printIntValue(++j);
		System.out.println("j "+j);
		decrement.printIntValue(j+1);
		System.out.println("j "+j);
		
		String s="sgfg12hjh";
		int length=s.length();
		char ch;int n;
		for(int i=0;i<length;i++){
			ch=s.charAt(i);
			if(Character.isDigit(s.charAt(i))){
				n=Character.getNumericValue(ch);
				System.out.println("the number is"+n);
			}
		}
	}
	public void printIntValue(int i){
		System.out.println("value of i "+i);
		
	}
}
