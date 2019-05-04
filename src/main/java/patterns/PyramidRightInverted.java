package patterns;

public class PyramidRightInverted {
	public static void main(String[] args) {
		PyramidRightInverted inverted = new PyramidRightInverted();
		inverted.printInvertedPyramid();
	}

	private void printInvertedPyramid() {
		int k = 2 * 5 - 1;
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <=k; j++) {
				System.out.print(" ");
			}
			k = k - 2;
			for (int j = 1; j <= i; j++) {
				System.out.println("*");
			}
		}
	}
}
