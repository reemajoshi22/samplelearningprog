package threads;

public class JoinExample implements Runnable {
	public static void main(String[] args) {
		JoinExample example = new JoinExample();
		Thread thread = new Thread(example);
		thread.setName("THREAD-ONE");
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread thread2 = new Thread(example);
		thread2.setName("THREAD-TWO");
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread thread3 = new Thread(example);
		thread3.setName("THREAD-THREE");
		thread3.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("i is " + i + "started by "
					+ Thread.currentThread().getName());
		}
	}

}
