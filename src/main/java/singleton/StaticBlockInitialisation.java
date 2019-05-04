package singleton;

public class StaticBlockInitialisation {
	private static StaticBlockInitialisation blockInitialisation;

	private StaticBlockInitialisation() {
	}
	static {
		try {
			blockInitialisation=new StaticBlockInitialisation();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static StaticBlockInitialisation getInstance(){
		return blockInitialisation;
	}
}
