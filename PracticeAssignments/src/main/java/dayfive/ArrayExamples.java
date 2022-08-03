package dayFive.com.usk.test;

public class ArrayExamples {
	public static void main(String args[]) {
		// creating array and declaring the values at beginning
		int[] numArr = { 15, 32, 78, 104, 1, 5, 9, 8, 3, 73 };
		int oddSum = 0;
		int evenSum = 0;

		// loop through array with for each loop
		for (int num : numArr) {
			// check if odd or even
			if (num % 2 == 0) {
				evenSum = evenSum + num;
			} else {
				oddSum = oddSum + num;
			}
		}

		// display the outputs of the summation
		System.out.println("odd number sum is : " + oddSum);
		System.out.println("even number sum is : " + evenSum);

		// Now an array of strings
		String[] strArr = { "Lime", "Lemon", "Grapefruit", "Orange", "Citron" };

		System.out.println("Here are some citrus");

		// a for each loop using each array object as fruit
		for (String fruit : strArr) {
			System.out.println(fruit);
		}

		// Now to create a 2 dimensional array and display the outputs
		int[][] dimArr = new int[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

		System.out.println("Here is a matrix of numbers for a 2 dimensional array");

		// loop through the array and display the number matrix
		for (int i = 0; i < dimArr.length; i++) {
			for (int j = 0; j < dimArr[i].length; j++) {
				System.out.print("[" + i + "," + dimArr[i][j] + "]" + " ");
			}
			System.out.print("\n");
		}

	}
}
