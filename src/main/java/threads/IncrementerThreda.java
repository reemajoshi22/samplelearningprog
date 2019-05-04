package threads;

public class IncrementerThreda extends Thread{
	private Counter counter;
	public IncrementerThreda(Counter counter){
		this.counter=counter;
	}
	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			counter.incrementCount();
		}
	}
	public static void main(String[] args) {
		Counter counter = new Counter(); 
		IncrementerThreda incrementerThreda=new IncrementerThreda(counter);
		IncrementerThreda incrementerThreda1=new IncrementerThreda(counter);
		incrementerThreda.start();
		incrementerThreda1.start();
		try {
			incrementerThreda.join();
			incrementerThreda1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("counter value"+counter.getCount()); 
	}

}
