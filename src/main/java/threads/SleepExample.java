package threads;

public class SleepExample implements Runnable {
	public static void main(String[] args) {
		SleepExample example=new SleepExample();
		Thread thread=new Thread(example);
		thread.setName("first");
		thread.start();
		Thread thread2=new Thread(example);
		thread2.setName("second");
		thread2.start();
		Thread thread3=new Thread(example);
		thread3.setName("third");
		thread3.start();
	}


	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("thread "+ Thread.currentThread().getName());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
