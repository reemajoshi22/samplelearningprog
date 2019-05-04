package threads;

public class SleepBookQuestion implements Runnable{
public static void main(String[] args) {
	SleepBookQuestion bookQuestion=new SleepBookQuestion();
	Thread thread=new Thread(bookQuestion);
	thread.start();
}
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			if(i%10==0){
			System.out.println(i);	
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
