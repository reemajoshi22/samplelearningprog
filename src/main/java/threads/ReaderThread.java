package threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderThread implements Runnable {

	File file;
	ReaderWriterModel model;

	public ReaderThread(ReaderWriterModel model) {
		this.model = model;
	}

	@Override
	public void run() {
		// File file = new File("E:\\uid-auth-data-server.log");
		int wordCount = 0;
		int charCount = 0;
		int lineCount = 0;
		synchronized (model) {

			try {
				// Thread.sleep(1000);
				FileInputStream fileInputStream = new FileInputStream(
						model.getFile());
				InputStreamReader inputStreamReader = new InputStreamReader(
						fileInputStream);
				BufferedReader bufferedReader = new BufferedReader(
						inputStreamReader);

				String currentLine = bufferedReader.readLine();
				while (!model.isWritten()) {
					model.wait();
				}
				System.out.println("after wait");
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
					System.out
							.println(" waiting to get notified from writer thread ");

				}
			} catch (InterruptedException e) {
				System.out.println("in interupted excpetion block");
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("word count is" + wordCount);
			System.out.println(" char count is" + charCount);
			System.out.println("line count is" + lineCount);

		}
	}

}
