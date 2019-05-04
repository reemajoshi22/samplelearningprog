package concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class CallableExample implements Callable<Integer> {
	public static void main(String[] args) {
		CallableExample callableExample =new CallableExample();
		try {
			callableExample.call();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Integer call() throws Exception {
		// Obtain a random number from 1 to 10
		int count = ThreadLocalRandom.current().nextInt(1, 11);
		for (int i = 1; i <= count; i++) {
			System.out.println("Running..." + i);
		}
		return count;
	}

}
