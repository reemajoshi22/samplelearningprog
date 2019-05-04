package com.learning;

import java.io.IOException;

public class RunTimeClass {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
