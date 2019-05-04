package threads;

public class IncrementThreadValue  {
	public static void main(String[] args) {
		ThreadIntIncrementFromOtherClass incrementFromOtherClass=new ThreadIntIncrementFromOtherClass();
		incrementFromOtherClass.setName("first");
		incrementFromOtherClass.start();
		ThreadIntIncrementFromOtherClass decrementFromOtherClass=new ThreadIntIncrementFromOtherClass();
		decrementFromOtherClass.setName("second");
		decrementFromOtherClass.start();
		synchronized(incrementFromOtherClass){
			try{
				System.out.println("waiting for thread to finish");
				incrementFromOtherClass.wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("value of varible is: " + incrementFromOtherClass.integerValue);
		}
	}

}

