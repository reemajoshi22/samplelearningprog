package threads;

public class WaitAndNotifyAllExample extends Thread {
	Calculator c;

	public WaitAndNotifyAllExample(Calculator calc) {
		c = calc;
	}

	@Override
	public void run() {
		synchronized (c) {
			try {
				System.out.println("waiting for calculation..");
				c.wait();
			} catch (InterruptedException e) {

			}
			System.out.println("Total is: " + c.total);
		}
	}
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		new WaitAndNotifyAllExample(calculator).start();
		new WaitAndNotifyAllExample(calculator).start();
		new WaitAndNotifyAllExample(calculator).start();
		new Thread(calculator).start();
	}
}
