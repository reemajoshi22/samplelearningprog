package threads;

public class IncreThreadJoinOnMain {
	public static int var = 0;

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				MyIncrementThread incrementThread=new MyIncrementThread();
				incrementThread.start();
				MyDecrementThread decrementThread=new MyDecrementThread();
				decrementThread.start();
			}
		};
		try {
			Thread thread=new Thread(runnable);
			thread.start();
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("value of variable is "+var);
	}
}

class MyIncrementThread extends Thread {
	@Override
	public void run() {
		System.out.println("MyIncrementThread");
		for(int i=0;i<10000;i++){
		IncreThreadJoinOnMain.var=IncreThreadJoinOnMain.var+1;
		}
		System.out.println("incremented value is"+IncreThreadJoinOnMain.var);
	}
}

class MyDecrementThread extends Thread {
	@Override
	public void run() {
		System.out.println("MyDecrementThread");
		for(int i=0;i<10000;i++){
			IncreThreadJoinOnMain.var--;
			}
		System.out.println("decremented value is"+IncreThreadJoinOnMain.var);
	}
}
