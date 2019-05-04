package com.learning;

public class SyncronisedThread implements Runnable {

	public void run() {
		printRun();
	}

	synchronized private void printRun() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "Thread");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		SyncronisedThread syncronisedThread = new SyncronisedThread();
		Thread thread = new Thread(syncronisedThread);
		// thread.sleep(5000);sleeps b4 invoking thread
		thread.start();
		/*
		 * try { thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		Thread thread1 = new Thread(syncronisedThread);
		thread1.start();

	}
}
