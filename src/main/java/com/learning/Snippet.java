package com.learning;

public class Snippet {
	String s = "";
	  boolean b1 = true;
	  boolean b2 = false;
	  
	  if((b2 = false) | (21%5) > 2) s += "x";
	 if(b1 || (b2 == true)) s += "y";
	 if(b2 == true) s += "z";
	 System.out.println(s);
}}

