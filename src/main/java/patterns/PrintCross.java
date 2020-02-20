package patterns;

public class PrintCross {
	static int n = 10;

	public static void main(String[] args) {
		PrintCross aBox = new PrintCross();
		//aBox.printCross(n);
		System.out.println("generic cross");
		aBox.genericPrintCross(n);
        aBox.printPattern(n);

	}

	private void genericPrintCross(int size) {
		//for cross (i == j || i + j == size - 1
		//rest for box
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j || i + j == size - 1||i==0||i==size-1||j==0||j==size-1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	private void printCross(int size) {
		// i for row
		// j for column
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j)
					System.out.print("*");
				if (i == 0 && j == 4)
					System.out.print("*");
				if (i == 1 && j == 3)
					System.out.print("*");
				if (i == 3 && j == 1)
					System.out.print("*");
				if (i == 4 && j == 0)
					System.out.print("*");
				if (i == 0 && j == 1)
					System.out.print("*");
				if (i == 0 && j == 2)
					System.out.print("*");
				if (i == 0 && j == 3)
					System.out.print("*");
				if (i == 1 && j == 0)
					System.out.print("*");
				if (i == 2 && j == 0)
					System.out.print("*");
				if (i == 3 && j == 0)
					System.out.print("*");
				if (i == 1 && j == 4)
					System.out.print("*");
				if (i == 2 && j == 4)
					System.out.print("*");
				if (i == 3 && j == 4)
					System.out.print("*");
				if (i == 4 && j == 1)
					System.out.print("*");
				if (i == 4 && j == 2)
					System.out.print("*");
				if (i == 4 && j == 3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

	static void printPattern(int lenghtOfPattern){
		int rowIndex,columnIndex,counter;
		for ( rowIndex = 0; rowIndex < lenghtOfPattern; rowIndex++) {
			if (rowIndex == 0 || rowIndex == lenghtOfPattern - 1) {
				for (columnIndex = 0; columnIndex < lenghtOfPattern; columnIndex++)
					System.out.print(" * ");
				System.out.println();
			}
			else {
				counter = lenghtOfPattern - 1 - rowIndex;
				for (columnIndex = 0; columnIndex < lenghtOfPattern; columnIndex++) {
					if (columnIndex == 0 || columnIndex == lenghtOfPattern - 1)
						System.out.print(" * ");
					else if (columnIndex == rowIndex || columnIndex == counter)
						System.out.print(" * ");
					else
						System.out.print("   ");
				}
				System.out.println();

			}
		}

	}
}
