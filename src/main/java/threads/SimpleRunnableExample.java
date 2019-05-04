package threads;

public class SimpleRunnableExample implements  Runnable {
	public void run() {
		for(int i=0;i<3;i++){
			System.out.println("Thread "+" "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		SimpleRunnableExample runnableExample =new SimpleRunnableExample();
		Thread t=new Thread(runnableExample);
		t.setName("firstthread");
		t.start();
	}
}
