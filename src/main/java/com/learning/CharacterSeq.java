package com.learning;

public class CharacterSeq {
	public static void main(String[] args) {
		CharacterSeq characterSequence = new CharacterSeq();
		int number = 55;
		for (int i = 1; i < number; i++) {
			System.out.print(" "+characterSequence.generateCharUpto(i));
			
		}
	}

	private String generateCharUpto(int n) {
		char c = 0;
		if (n < 27) {
			c = (char) (n + 64);
			return Character.toString(c);
		} else {
			if (n % 26 == 0) {
				return generateCharUpto((n/26)-1)+generateCharUpto((n-1)%26+1);

			} else {
				return generateCharUpto(n / 26) + generateCharUpto(n % 26);

			}

		}

	}

}
