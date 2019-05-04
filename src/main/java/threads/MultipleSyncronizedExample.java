package threads;

public class MultipleSyncronizedExample implements Runnable{
	public static void main(String[] args) {
		MultipleSyncronizedExample example=new MultipleSyncronizedExample();
		Thread threads=new Thread(example);
		threads.start();
		
		Thread thread2=new Thread(example);
		thread2.start();
	}
	@Override
	public void run() {
		printNumbers();
		printAlphabets();
	}
	private  synchronized void printAlphabets() {
		for(char  ch = 'a' ; ch <= 'f' ; ch++ ){
			System.out.println("inside print alphabets method "+ch+" "+Thread.currentThread().getName());
		}
	}
	private synchronized void printNumbers() {
		for(int i=0;i<5;i++){
			System.out.println("inside print numbers method "+i+" "+Thread.currentThread().getName());
		}
	}

}
