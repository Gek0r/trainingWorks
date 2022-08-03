package test.com.training;

public class CustomCatch {

	public static void main(String[] args) {
		// An example of an exception that throws a custom message when caught
		int sum = 0;

		int[] nums = { 10, 20, 30, 40, 50, 60, 70 };

		try {
			for (int i = 0; i < nums.length; i++) {
				System.out.println("Sum is now " + sum);
				if (sum >= 100) {
					throw new UserException("You have reached the sum limit!");
				}
				sum = sum + nums[i];
			}

		} catch (UserException e) {
			System.out.println("You have been caught!");
			System.out.println(e);
		}
	}

}

class UserException extends Exception {
	String message;

	UserException(String message) {
		this.message = message;
	}

	public String toString() {
		return message;
	}
}