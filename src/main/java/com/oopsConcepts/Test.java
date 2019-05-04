package com.oopsConcepts;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	 
	    char[] X=s1.toCharArray();
	    char[] Y=s2.toCharArray();
	    int m = X.length;
	    int n = Y.length;
	 
	    System.out.println("Length of LCS is" + " " +
	    		Test.lcs( X, Y, m, n ) );
		/*String x = "abc";
		String y = "xyz";
		x.concat(y);
		System.out.print(x);*/
		
		
	/*	String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);*/
/*		
int x = 10*20-20;
		
		System.out.println(x);
		char c = 65;
		System.out.println("c = "+c);*/
		
}
	static int lcs( char[] X, char[] Y, int m, int n )
	  {
	    if (m == 0 || n == 0)
	      return 0;
	    if (X[m-1] == Y[n-1])
	      return 1 + lcs(X, Y, m-1, n-1);
	    else
	      return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
	  }
	static int max(int a, int b)
	  {
	    return (a > b)? a : b;
	  }
}