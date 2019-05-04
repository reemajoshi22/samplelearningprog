package singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton safeSingleton;
	 private ThreadSafeSingleton(){
		 
	 }
	 public static synchronized ThreadSafeSingleton getInstance(){
		 if(safeSingleton!=null){
			 safeSingleton=new ThreadSafeSingleton();
		 }
		 return safeSingleton;
	 }
}
