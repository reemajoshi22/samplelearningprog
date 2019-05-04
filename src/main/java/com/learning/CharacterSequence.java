package com.learning;

import java.util.Arrays;

public class CharacterSequence {
	public static void main(String[] args) {

		CharacterSequence characterSequence = new CharacterSequence();
		//characterSequence.generateCharUpto(27);
		for (int i = 1;i<55;i++) {
		    System.out.println("i="+i+" -> "+IntToLetter(i));
		  }

	}

	public static String IntToLetter(int Int) {
		if (Int < 27) {
			return Character.toString((char) (Int + 96));
		} else {
			if (Int % 26 == 0) {
				return IntToLetter((Int / 26) - 1)
						+ IntToLetter(((Int - 1) % 26 + 1));
			} else {
				return IntToLetter(Int / 26) + IntToLetter(Int % 26);
			}
		}
	}

	private void generateCharUpto(int n) {
		int number = 65 + n;
		char c = 0;
		if(number<92){
		for (int i = 65; i < number; i++) {
			c = (char) i;
			System.out.print(c + " ");
		}
		}
		else{
			if(number%91==0){
				
			}
			else{
				for (int i = 65; i < number%91; i++) {
					c = (char) i;
					System.out.print(c + " ");
				}
			}
			
		}
	}
}
