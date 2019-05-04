package threads;

public class YieldExample implements Runnable {
	public static void main(String[] args) {
		YieldExample example = new YieldExample();
		Thread thread = new Thread(example);
		thread.setName("Thread-ONE");
		thread.start();
		thread.setPriority(10);
		Thread thread1 = new Thread(example);
		thread1.setName("Thread-TWO");
		thread1.start();
		thread1.setPriority(10);
		for (int i = 0; i < 10; i++) {
			System.out.println("MAIN THREAD");
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i " + i + Thread.currentThread().getName());
			Thread.yield();
		}
	}

}
