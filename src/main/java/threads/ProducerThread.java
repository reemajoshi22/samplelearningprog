package threads;

public class ProducerThread implements Runnable {

	Message message;

	public ProducerThread(Message message) {
		this.message = message;
	}

	@Override
	public void run() {
		synchronized (message) {
			try {
				System.out.println(Thread.currentThread().getName()
						+ "waiting to get notified"
						+ System.currentTimeMillis());
				message.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+ "got notified at" + System.currentTimeMillis());
			System.out.println(Thread.currentThread().getName()
					+ "processing the message now" + message.getMesage());
		}

	}

}
