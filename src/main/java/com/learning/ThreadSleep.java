package com.learning;

public class ThreadSleep implements Runnable {
	public static void main(String[] args) throws InterruptedException {
		ThreadSleep threadSleep = new ThreadSleep();
		Thread thread2 = new Thread(threadSleep);
		thread2.start();
		thread2.sleep(5000);
		Thread thread3 = new Thread(threadSleep);
		thread3.start();

	}

	public void run() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "Thread is running");
		}
	}
}
