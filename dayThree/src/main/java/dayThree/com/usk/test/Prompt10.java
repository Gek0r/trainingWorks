package dayThree.com.usk.test;

public class Prompt10 {

	public static void main(String[] args) {
		// Iterate for loop from 1 to 100, and using continue statement print only odd numbers
		for(int i = 1; i <= 100; i++)
		{
			//check to see if odd
			if(i % 2 != 0)
			{
				//print odd number
				System.out.println(i);
				//brings us back to the top of the next cycle
				continue;
			}
		}

	}

}
