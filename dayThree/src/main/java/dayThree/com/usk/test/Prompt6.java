package dayThree.com.usk.test;

public class Prompt6 {

	public static void main(String[] args) {
		// Print number 1 to 5, 5 times using nested for loops
		
		//first loop for the total count
		for(int i = 1; i <= 5; i++)
		{
			//second loop for printing the numbers requested
			System.out.println("Loop number: " + i);
			for(int j = 1; j <= 5; j++)
			{
				System.out.println(j);
			}
		}

	}

}
