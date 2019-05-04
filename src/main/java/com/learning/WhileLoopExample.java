package com.learning;

public class WhileLoopExample {
	public static void main(String[] args) {
		int x = 2;
		while(x == 2) {
		 System.out.println(x++);
		 ++x;
		}
		labelledWhile();
		boolean value=doStuff();
		System.out.println(value);
		int [] a = {1,2,3,4};
		for(int n : a) // enhanced for loop
			 System.out.print(n);
		outer:
			 for (int i=0; i<5; i++) {
			inner: for (int j=0; j<5; j++) {
			 System.out.println("Hello"+i);
			 break inner;
			 } // end of inner loop
			 System.out.println("outer"); // Never prints
			 }
			System.out.println("Good-Bye");
	}

	private static void labelledWhile() {
		int age=0;
		outer:while(age<=21){
			if(age==16)
			{
				System.out.println(" get your driver's license");
				continue outer;
			}
			else{
				System.out.println("another year"+age);
			}
			age++;
		}
	}

	private static boolean doStuff() {
			 for (int x = 0; x < 3; x++) {
			 if(x==1){
				 continue;
			 }
			 System.out.println("in for loop"+x);
			 }
			 System.out.println("after for");
			 return true;
				
	}
}
