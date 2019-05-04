package patterns;

public class PyramidRight {
	public static void main(String[] args) {
		PyramidRight left = new PyramidRight();
		left.printAestricPyramid();
		left.printNumberPyramid();
	}

	private void printAestricPyramid() {
		int i, j, k = 2 * 5 - 1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= k; j++) {
				System.out.print(" ");
			}
			k = k - 2;
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void printNumberPyramid() {
		int i, j, k = 2 * 5 - 1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= k; j++) {
				System.out.print(" ");
			}
			k = k - 2;
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
