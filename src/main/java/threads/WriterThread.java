package threads;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterThread implements Runnable {

	File file;
	ReaderWriterModel model;

	public WriterThread(ReaderWriterModel model) {
		this.model = model;
	}

	@Override
	public void run() {
		try {
			synchronized (model) {
				BufferedWriter bufferedWriter = new BufferedWriter(
						new FileWriter(model.getFile(), true));
				bufferedWriter.write("this is a new line ");
				bufferedWriter.write("this is a new line ");
				bufferedWriter.flush();
				bufferedWriter.close();
				model.setWritten(true);
				System.out.println(Thread.currentThread().getName()
						+ " done with writing");

				model.notify();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
