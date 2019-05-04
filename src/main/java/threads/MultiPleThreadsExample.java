package threads;

public class MultiPleThreadsExample implements Runnable{
public static void main(String[] args) {
	MultiPleThreadsExample example=new MultiPleThreadsExample();
	Thread thread=new Thread(example);
	thread.setName("first");
	thread.start();
	Thread threa1=new Thread(example);
	threa1.setName("second");
	threa1.start();
	Thread thread2=new Thread(example);
	thread2.setName("third");
	thread2.start();
}

@Override
public void run() {
	for(int i=0;i<5;i++)
	System.out.println("Thread"+" "+ Thread.currentThread().getName());
}
}
