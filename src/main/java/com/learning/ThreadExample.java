package com.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample implements Runnable {

	public void run() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		System.out.println(name + "thread is running..."
				+ getRandomNumberInRange(0, 100));
		/*
		 * try { Thread.sleep(500); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */

	}

	private int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		List<ThreadExample> examples = new ArrayList<ThreadExample>();
		for (int i = 0; i < 100; i++) {
			ThreadExample example = new ThreadExample();
			examples.add(example);
			pool.execute(example);
		}
	}
}
