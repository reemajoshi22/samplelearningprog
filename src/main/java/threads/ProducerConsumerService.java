package threads;

public class ProducerConsumerService {
	public static void main(String[] args) {
		Message message = new Message("process it");
		ProducerThread producerThread = new ProducerThread(message);
		new Thread(producerThread, "producer1 ").start();

		ProducerThread producerThread1 = new ProducerThread(message);
		new Thread(producerThread1, "producer2 ").start();

		ConsumerThread consumerThread = new ConsumerThread(message);
		new Thread(consumerThread, "consumer ").start();

		System.out.println("all threads started");

	}
}
