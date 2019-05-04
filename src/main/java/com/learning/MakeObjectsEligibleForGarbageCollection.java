package com.learning;

public class MakeObjectsEligibleForGarbageCollection {
	
		 public static void main(String [] args) {
				 nullaReference();
				 reassignVariable();
		}

		private static void reassignVariable() {
			StringBuffer s1 = new StringBuffer("hello");
			 StringBuffer s2 = new StringBuffer("goodbye");
			 System.out.println(s1);
			 // At this point the StringBuffer "hello" is not eligible
			 s1 = s2; // Redirects s1 to refer to the "goodbye" object
			 // Now the StringBuffer "hello" is eligible for collection
			 
			
		}

		private static void nullaReference() {
			StringBuffer sb = new StringBuffer("hello");
			 System.out.println(sb);
			 // The StringBuffer object is not eligible for collection
			 sb = null;
			 // Now the StringBuffer object is eligible for collection
		}
		
}
