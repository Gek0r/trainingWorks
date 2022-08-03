package daytwo;

public class Prompt8 {

	public static void main(String[] args) {
		// print odd numbers between 50 to 100 using do while loop
		int i = 50;
		do
		{
			//if it has a remainder, print it
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
			//add to i
			i++;
			//check to see if i is less than max value stil
		}while(i < 100);
	}

}
