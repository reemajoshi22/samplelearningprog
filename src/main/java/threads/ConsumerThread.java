package threads;

public class ConsumerThread implements Runnable {

	Message message;

	public ConsumerThread(Message message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		synchronized (message) {

			try {
				Thread.sleep(1000);
				System.out
						.println(Thread.currentThread().getName() + "started");
				message.setMesage(" "+Thread.currentThread().getName()
						+ "notifier work done");
				message.notify();
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

}
