package com.learning;

public class IntegerintExample {

	public void display(int i) {
		System.out.println("integer");
	}

	public void display(Integer i) {
		System.out.println("INTEGER");
	}
	
	public void displaybyte(byte[] bs) {
		System.out.println("byte");
	}

	public void displaybyte(Byte i) {
		System.out.println("BYTE");
	}
	public static void main(String[] args) {
		IntegerintExample example=new IntegerintExample();
		example.display(1);
		example.display(new Integer(1));
		
		example.displaybyte("r".getBytes());
		example.displaybyte(new Byte((byte) 1));
	}
	

}
