package com.learning;

class CardBoard {
	 Short story = 200;
	 CardBoard go(CardBoard cb) {
	 cb = null;
	 return cb;
	 }
	 public static void main(String[] args) {
		 int i1 = 1_000; // line A
		 int i2 = 10_00; // line B
		 //int i3 = _10_000; // line C
		 int i4 = 0b101010; // line D
		 int i5 = 0B10_1010; // line E
		 int i6 = 0x2_a; 
		 System.out.println(i1);
		 System.out.println(i2);
		 System.out.println(i4);
		 System.out.println(i5);
		 System.out.println(i6);
		 
	 CardBoard c1 = new CardBoard();
	 CardBoard c2 = new CardBoard();
	 CardBoard c3 = c1.go(c2);
	 c1 = null;
	 // do Stuff
	} }