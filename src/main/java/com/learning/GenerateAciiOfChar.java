package com.learning;

public class GenerateAciiOfChar {
	public static void main(String[] args) {
		GenerateAciiOfChar aciiOfChar = new GenerateAciiOfChar();
		aciiOfChar.genetareAsci();
		aciiOfChar.generateCharOfAscii();
		aciiOfChar.generateAsciiUptoSomeInt(2);

	}

	private void generateAsciiUptoSomeInt(int n) {
		int number=65+n;
		for(int i=65;i<number;i++){
			System.out.println("characters upto n "+Character.toString((char)i));
		}
	}

	private void generateCharOfAscii() {
		for (int i = 65; i <= 90; i++) {
			String string = Character.toString((char) i);
			System.out.println("char of ascii value is " + string);
		}
	}

	private void genetareAsci() {
		char c = 'A';
		int i = c;
		System.out.println(i);
		for (char C = 'A'; C <= 'Z'; C++) {
			int I = C;
			System.out.println(I);
		}

	}
}
