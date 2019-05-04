package threads;

public class ThreadIntIncrementFromOtherClass extends Thread {
	public int integerValue = 0;

	public void printValue() {
		System.out.println("value of i is" + integerValue);
	}

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				if (Thread.currentThread().getName().equals("first")) {
					System.out.println("incrementing counter");
					integerValue = integerValue + 1;
				}
				if (Thread.currentThread().getName().equals("second")) {
					System.out.println("decrementing counter");
					integerValue = integerValue - 1;
				}
			}
			notify();
		}
	}

}
