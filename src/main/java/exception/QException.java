package exception;

public class QException extends Exception {
	public static void main(String[] args) {
		System.out.println("t1 ");

		try {
			System.out.println("t2 ");
			try {
				throw new QException();
			} finally {
				System.out.println("f2 ");
			}
		} catch (QException e) {
			System.out.println("qe ");
		} finally {
			System.out.println("f1 ");
		}
	}
}