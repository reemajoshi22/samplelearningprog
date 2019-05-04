package singleton;

public class DoubleCheckLocking {
	private static DoubleCheckLocking checkLocking;
	private DoubleCheckLocking() {
	}
	public static DoubleCheckLocking getInstance(){
		if(checkLocking==null){
			synchronized (DoubleCheckLocking.class) {
				if(checkLocking==null){
					checkLocking=new DoubleCheckLocking();
				}
			}
		}
		return checkLocking;
	}
}
