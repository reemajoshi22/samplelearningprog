package com.learning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileAndCount {
	public static void main(String[] args) {
		File file = new File("E:\\uid-auth-data-server.log");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			InputStreamReader inputStreamReader = new InputStreamReader(
					fileInputStream);
			BufferedReader bufferedReader = new BufferedReader(
					inputStreamReader);

			String line;
			int wordCount = 0;
			int charCount = 0;
			int whitespacecount = 0;
			int lineCount = 0;
			try {
				String currentLine = bufferedReader.readLine();
				while (currentLine != null) {
					lineCount++;
					String[] words = currentLine.split(" ");
					// update word count
					wordCount = wordCount + words.length;

					// iterating each word will give charachet count
					for (String string : words) {
						charCount = charCount + string.length();

					}
					currentLine = bufferedReader.readLine();

				}
				System.out.println("word count is" + wordCount);
				System.out.println(" char count is" + charCount);
				System.out.println("line count is" + lineCount);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
