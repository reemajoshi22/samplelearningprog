package patterns;

public class PyramidLeftInverted {
	public static void main(String[] args) {
		PyramidLeftInverted inverted = new PyramidLeftInverted();
		inverted.printInverted();
		inverted.printNumberInverted();
	}

	private void printInverted() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	private void printNumberInverted() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
