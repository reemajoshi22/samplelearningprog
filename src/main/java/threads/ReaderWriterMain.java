package threads;

import java.io.File;

public class ReaderWriterMain {
	public static void main(String[] args) {
		ReaderWriterModel model = new ReaderWriterModel();
		model.setFile(new File("E:\\uid-auth-data-server.log"));

		ReaderThread thread2 = new ReaderThread(model);
		new Thread(thread2, " reader thread ").start();

		ReaderThread thread3 = new ReaderThread(model);
		new Thread(thread3, " reader thread ").start();

		WriterThread thread = new WriterThread(model);
		new Thread(thread, " writer thread ").start();

		WriterThread thread4 = new WriterThread(model);
		new Thread(thread4, " writer thread ").start();

		System.out.println(" started all the threads ");
	}

}
