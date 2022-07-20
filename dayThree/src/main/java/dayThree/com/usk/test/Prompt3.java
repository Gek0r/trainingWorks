package dayThree.com.usk.test;

public class Prompt3 {
	public static void main(String args[]) {
		// Print the given number(command line argument) is even or odd

		// take input from args
		int num = Integer.parseInt(args[0]);

		// check if the remainder is 0
		if (num % 2 == 0) {
			// if remainder is zero, then it is even
			System.out.println("The number is even");
		} else {
			// otherwise it is odd
			System.out.println("The number is odd");
		}
	}

}
