package threads;

import java.io.File;

public class ReaderWriterModel {
	File file;
	boolean isWritten;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public boolean isWritten() {
		return isWritten;
	}

	public void setWritten(boolean isWritten) {
		this.isWritten = isWritten;
	}

}
