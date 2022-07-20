package dayThree.com.usk.test;

public class Prompt4 {

	public static void main(String[] args) {
		// For a given number integer, print in the words using switch statement 1 to
		// 10.
		// EX: if the input is 5, then it should print "Five"
		int number = Integer.parseInt(args[0]);
		//set the case for each individual number
		switch (number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		}

	}

}
