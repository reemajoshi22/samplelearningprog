package singleton;

public class LazyInitialisation {
	private LazyInitialisation initialisation;
	private LazyInitialisation(){
		
	}
	public LazyInitialisation getInstance(){
		if(initialisation!=null){
			initialisation=new LazyInitialisation();
		}
		return initialisation;
		
	}
}
