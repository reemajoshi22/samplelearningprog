package threads;

public class PrintDiffUsingThreads implements Runnable{
	 int i=0;
	public static void main(String[] args) {
		PrintDiffUsingThreads diffUsingThreads=new PrintDiffUsingThreads();
		Thread thread=new Thread(diffUsingThreads);
		thread.setName("THREAD-ONE");
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread thread2=new Thread(diffUsingThreads);
		thread2.setName("THREAD-TWO");
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread thread3=new Thread(diffUsingThreads);
		thread3.setName("THREAD-THREE");
		thread3.start();
	}

	@Override
	public void run() {
		i=i+1;
		System.out.println("value of i is "+i+" "+ Thread.currentThread().getName());
	}

}
