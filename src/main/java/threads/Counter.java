package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	//int count;
	//converting into atomic
	private AtomicInteger count = new AtomicInteger();
	public void incrementCount() {
		//count++;
		count.getAndIncrement(); // atomic operation
	}
	public int getCount() {
		//return count;
		return count.intValue();
	}
	
	

}
