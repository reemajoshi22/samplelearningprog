package concurrent;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableCalculatorExampple implements Callable<Integer> {
	static int num;

	public CallableCalculatorExampple(int num) {
		this.num = num;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			Integer number = random.nextInt(10);
			CallableCalculatorExampple calculatorExampple = new CallableCalculatorExampple(
					number);
			try {
				Integer result = calculatorExampple.call();
				System.out.println("Factorial of " + num + " is " + result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Integer call() throws Exception {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
