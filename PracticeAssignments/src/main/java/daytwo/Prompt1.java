package daytwo;

public class Prompt1 {

	public static void main(String[] args) {
		// Take couple of variables (like int i=1, j=5) and do
		// Arithmetic
		// Unary
		// Relation and
		// Logical Operation
		int i = 4;
		int j = 9;
		//display inputs
		System.out.println("int i = " + i);
		System.out.println("int j = " + j);
		
		//arithmetic operation
		System.out.println("i + j = " + (i + j));
		
		//Unary operation
		System.out.println("i++ is " + (i++) + " While ++j is " + (++j));
		
		//relation operation
		if(i > j)
		{
			System.out.println("i is bigger than j");
		}
		else
		{
			System.out.println("j is bigger than i");
		}
		
		//logical operation
		if(i == 5 || j == 5)
		{
			System.out.println("One of these numbers is equal to 5");
		}
		else
		{
			System.out.println("Can you make one of these numbers 5 instead?");
		}
		
	}

}
