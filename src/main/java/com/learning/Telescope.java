package com.learning;

public class Telescope {
	static int magnify = 2;

	public static void main(String[] args) {
		char sex='m';
		System.out.println(sex<'f');
		go();
	}

	static void go() {
		int magnify = 3;
		zoomIn();
	}

	static void zoomIn() {
		magnify *= 5;
		zoomMore(magnify);
		System.out.println(magnify);
	}

	static void zoomMore(int magnify) {
		magnify *= 7;
	}
}