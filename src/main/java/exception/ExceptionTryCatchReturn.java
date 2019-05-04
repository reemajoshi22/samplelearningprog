package exception;

public class ExceptionTryCatchReturn {
	public static void main(String[] args) {
		System.out.println(ExceptionTryCatchReturn.test());
	}

	private static int test() {
		try {
			System.out.println("try executed");
			//throw new Exception();
			return 0;
		}
		catch(Exception e){
			System.out.println("exception executed");
			return 1;
			
		}finally {
			System.out.println("finally trumps return.");
			return 2;
		}
	}

}
