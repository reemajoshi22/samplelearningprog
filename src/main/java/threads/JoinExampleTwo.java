package threads;

public class JoinExampleTwo {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread t = new Thread(myThread);
		t.start();
		try {
			System.out.println("waitimg for  thread to finish");
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}

class MyThread implements Runnable {
	Thread t = new Thread();

	@Override
	public void run() {
		try {
			System.out.println("waitimg for main thread to finish");
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}

}
