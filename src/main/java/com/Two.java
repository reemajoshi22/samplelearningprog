package com;

import com.learning.One;

public class Two extends One{

	One one=new One();
	public String display(){System.out.println("diaplay  " + one.display());
	return "one";
	}
}
class three {
	public static void main(String[] args) {
		Two two=new Two();
		two.display();
	}
}

