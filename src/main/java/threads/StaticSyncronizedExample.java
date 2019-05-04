package threads;

public class StaticSyncronizedExample implements Runnable {
	static int staticVaribale = 10;
	int nonStaticVaribale = 10;

	public static void main(String[] args) {
		StaticSyncronizedExample example = new StaticSyncronizedExample();
		Thread thread = new Thread(example);
		thread.start();

		Thread thread2 = new Thread(example);
		thread2.start();
	}

	@Override
	public void run() {
		printSyncronzedmethod();
	}

	private synchronized static void printSyncronzedmethod() {
		System.out.println(new StaticSyncronizedExample().nonStaticVaribale+1
				+ " " + Thread.currentThread().getName());
		System.out.println(staticVaribale + 1);
	}

}
