package singleton;

public class EagerInitialisation {
	private static EagerInitialisation eagerInitialisation = new EagerInitialisation();

	// private constructor to avoid outer classes to call its constructor
	private EagerInitialisation() {
	}
	public static EagerInitialisation getInstance(){
		return eagerInitialisation;
		
	}
}
