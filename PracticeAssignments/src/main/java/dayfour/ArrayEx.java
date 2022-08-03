package dayfour;

public class ArrayEx {
	public static void main(String args[]) {
		// fixed length group of similar element types
		// starts at 0
		int intArr[] = new int[5];
		intArr[0] = 5;
		intArr[2] = 8;
		for (int i : intArr) {
			System.out.println(i);

		}
		// can also be declared with elements ahead of time
		String strArr[] = { "HCL", "Tech", "USA" };

		// arrays can be multi dimensional
		int intArr2[][] = new int[3][5];
		// or in a predeclared way
		int inrArr3[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	}

}
