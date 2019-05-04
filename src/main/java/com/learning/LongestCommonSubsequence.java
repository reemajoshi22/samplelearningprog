package com.learning;

import org.springframework.util.StopWatch;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		StopWatch stopWatch=new StopWatch();
		LongestCommonSubsequence commonSubsequence=new LongestCommonSubsequence();
		commonSubsequence.findLength("gxtxayb","aggtaab");
		Double time= stopWatch.getTotalTimeSeconds();
		System.out.println("total time to find LCS"+time);
	}

	private void findLength(String firstString, String secondString) {
		/*for(int i=0;i<firstString.length();i++){
			char Char=firstString.charAt(i);
		}*/
	}

}
