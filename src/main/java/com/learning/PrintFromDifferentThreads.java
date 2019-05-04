package com.learning;

public class PrintFromDifferentThreads implements Runnable {
	char c='A';
	public static void main(String[] args) {
		PrintFromDifferentThreads differentThreads=new PrintFromDifferentThreads();
		Thread one=new Thread(differentThreads);
		one.start();
		try {
			one.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread two=new Thread(differentThreads);
		two.start();
		try {
			two.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread three=new Thread(differentThreads);
		three.start();

	}

	@Override
	public void run() {
		System.out.println(c++);
	}
}
