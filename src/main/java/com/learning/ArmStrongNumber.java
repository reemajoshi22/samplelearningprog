package com.learning;

public class ArmStrongNumber {
	public static void main(String[] args) {
		ArmStrongNumber armStrongNumber=new ArmStrongNumber();
		int reversedNumber=armStrongNumber.IsArmStrongNumber(153);
		System.out.println(reversedNumber);
	}

	private int IsArmStrongNumber(int i) {
		int reversedNumber=0;
		while(i>0){
		int remainder=i%10;
		i=i/10;
		reversedNumber=reversedNumber+(remainder*remainder*remainder);
		}
		return reversedNumber;
	}
}
