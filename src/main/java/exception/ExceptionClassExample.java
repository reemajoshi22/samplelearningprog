package exception;

import java.io.FileNotFoundException;
import java.net.SocketException;

public class ExceptionClassExample {
	public static void main(String[] args) {
		try {
			throw new SocketException();
			
		} catch (SocketException e) {
		}
	}
}
