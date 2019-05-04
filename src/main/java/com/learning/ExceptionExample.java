package com.learning;

public class ExceptionExample {
	public static void main(String[] args) {
		int res=perform();
		System.out.println(res);
	}

	private static int perform() {
		try{
			System.out.println("try block");
			//System.exit(0);
			return 4;
			//throw new Exception();
			
		}
		catch(Exception e){
			System.out.println("catch block");
			return 2;
		}
		finally{
			System.out.println("finally block");
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("inner catch block after finally");
			}
			//return 1;
		}
		/*System.out.println("outside all blocks");
		return 1;*/
	}

}
