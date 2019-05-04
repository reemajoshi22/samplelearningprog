package concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class CallableExecutorExample implements Callable<Integer> {
	int num;

	public CallableExecutorExample(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		return fact;
	}

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		int cpus = rt.availableProcessors();
		System.out.println("processors "+ cpus);
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors
				.newFixedThreadPool(2);
		List<Future<Integer>> futureList = new ArrayList<>();
		int number = 0;
		for (int i = 0; i < 10; i++) {
			Random num = new Random();
			number = num.nextInt(10);
			System.out.println(number);
			CallableExecutorExample callableExecutorExample = new CallableExecutorExample(
					number);
			Future<Integer> s = executor.submit(callableExecutorExample);
			futureList.add(s);
		}
		for (Future<Integer> future : futureList) {
			try {
				System.out.println("Factorial of " + future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();
	}
}
