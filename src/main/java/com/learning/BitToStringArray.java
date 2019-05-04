package com.learning;

import java.util.BitSet;
import java.util.Date;

public class BitToStringArray {
	public static void main(String[] args) {
	    BitSet bs = new BitSet();
	    bs.set(7);
	    bs.set(1);
	    byte[] bytes = new byte[(bs.length() + 7) / 8];
	    int i=bytes[0];
	    System.out.println(i);
	    
	    String dateInString = "7-Jun-2013";
	    System.out.println("date "+new Date(dateInString));
	   /* bs.set(31);
	    bs.set(15);
	    bs.set(18);*/
	   /* int[] intArray = bits2Ints(bs);

	    for (int i = 0; i < intArray.length; i++)
	      System.out.println("to binary "+toBinary(intArray[i]));*/
	    
	    convertIntoBinaryNumber(5);
	  }

	  private static void convertIntoBinaryNumber(int i) {
		  System.out.println("binary rep of 4 "+Integer.toBinaryString(i));
	}

	static int[] bits2Ints(BitSet bs) {
	    int[] temp = new int[bs.size() / 32];

	    for (int i = 0; i < temp.length; i++)
	      for (int j = 0; j < 32; j++)
	        if (bs.get(i * 32 + j))
	          temp[i] |= 1 << j;

	    return temp;
	  }

	  static String toBinary(int num) {
	    StringBuffer sb = new StringBuffer();

	    for (int i = 0; i < 32; i++) {
	      sb.append(((num & 1) == 1) ? '1' : '0');
	      num >>= 1;
	    }

	    return sb.reverse().toString();
	  }

}