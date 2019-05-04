package concurrent;

import java.util.concurrent.TimeUnit;

public class ThreadPoolTask implements Runnable {
	String name;

	public ThreadPoolTask(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		 Long duration = (long) (Math.random() * 10);
		System.out.println("Executed " + name);
		 try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
