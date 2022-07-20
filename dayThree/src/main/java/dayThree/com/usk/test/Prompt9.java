package dayThree.com.usk.test;

public class Prompt9 {

	public static void main(String[] args) {
		// Print prime numbers from 1 to 100
		
		//if it is prime, it is only divisible by itself, 
		//so we need to check if has any divisible numbers before we print
		//make var to determine if it is prime
		Boolean isPrime = false;
		//build the loop to print prime numbers
		for(int i = 1; i <= 100; i++)
		{
			if(i == 1)
			{
				continue;
			}
			//we assume that it is prime
			isPrime = true;
			
			for(int j = 2; j <= i / 2; j++)
			{
				//if i is ever divisible by j, our running tally, then break and continue loop, otherwise print 
				if( i % j == 0)
				{
					//if it is prime, break and move on, no need to keep looping
					isPrime = false;
					break;
				}
			}

			if(isPrime == true)
			{
				System.out.println(i);
			}

		}
		
	}

}
