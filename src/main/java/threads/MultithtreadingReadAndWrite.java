package threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultithtreadingReadAndWrite {
	public static void main(String[] args) {
		MultithtreadingReadAndWrite multithtreadingReadAndWrite = new MultithtreadingReadAndWrite();
		multithtreadingReadAndWrite.thread1.start();
		multithtreadingReadAndWrite.thread2.start();

	}

	Thread thread1 = new Thread("reading file thread") {
		@Override
		public void run() {
			File file = new File("E:\\uid-auth-data-server.log");
			FileInputStream fileInputStream;
			try {
				int wordCount = 0;
				int lineCount = 0;
				fileInputStream = new FileInputStream(file);
				InputStreamReader inputStreamReader = new InputStreamReader(
						fileInputStream);
				BufferedReader bufferedReader = new BufferedReader(
						inputStreamReader);
				String currentLine = null;
				try {
					currentLine = bufferedReader.readLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				while (currentLine != null) {
					lineCount++;
					String[] words = currentLine.split(" ");
					wordCount = wordCount + words.length;
					try {
						currentLine = bufferedReader.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					inputStreamReader.close();
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
						+ " line count is" + lineCount);
				System.out.println(Thread.currentThread().getName()
						+ " word count is" + wordCount);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			super.run();
		}
	};

	Thread thread2 = new Thread("writing file thread") {
		public void run() {
			try {
				BufferedWriter bufferedWriter = new BufferedWriter(
						new FileWriter(
								new File("E:\\uid-auth-data-server.log"), true));
				bufferedWriter.write("this is a new line ");
				try {
					thread2.wait(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bufferedWriter.write("this is a new line ");
				bufferedWriter.flush();
				bufferedWriter.close();
				System.out.println(Thread.currentThread().getName()
						+ " done with writing");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};

}
