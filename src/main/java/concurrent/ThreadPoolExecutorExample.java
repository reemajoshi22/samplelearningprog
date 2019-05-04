package concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorExample {
	public static void main(String[] args) {
		ThreadPoolExecutor threadPoolExecutor=(ThreadPoolExecutor)Executors.newFixedThreadPool(2);
		for(int i=0;i<10;i++){
			ThreadPoolTask threadPoolTask=new ThreadPoolTask("Task "+i);
			 System.out.println("Created : " + threadPoolTask.getName());
			 threadPoolExecutor.execute(threadPoolTask);
		}

		/*for(int i=0;i<10;i++){
		ThreadPoolTask poolTask=new ThreadPoolTask("Task "+i);
		Thread thread=new Thread(poolTask);
		thread.start();
		
		}*/
	}

}
