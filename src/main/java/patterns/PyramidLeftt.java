package patterns;

public class PyramidLeftt {
	public static void main(String[] args) {
		PyramidLeftt pyramidRight = new PyramidLeftt();
		pyramidRight.printPyramid(5);
		pyramidRight.printNumberPyramid();
	}

	private void printNumberPyramid() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private void printPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}