package dayThree.com.usk.test;

public class Prompt11 {

	public static void main(String[] args) {
		//Iterate for loop from 50 to 100, and using break statement print only even numbers till 75
		for(int i = 50; i < 100; i++)
		{
			//first check if 75 has been hit yet
			if(i >= 75)
			{
				break;
			}
			//if not, move on and check to see if even
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}

}
