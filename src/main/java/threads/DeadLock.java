package threads;

public class DeadLock {
	String str1 = "java";
	String str2 = "DeadLock";

	Thread thread1 = new Thread("thread one") {
		public void run() {
			while (true) {
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1 + str2);
					}

				}
			}
		}
	};

	Thread thread2 = new Thread("thread two") {
		public void run() {
			synchronized (str2) {
				synchronized (str1) {
					System.out.println(str2 + str1);
				}

			}
		}

	};

	public static void main(String[] args) {
		DeadLock deadLock = new DeadLock();
		deadLock.thread1.start();
		deadLock.thread2.start();
	}
}
