package dayFour.com.usk.test;

public class OverrideExample {
	public static void main(String args[])
	{
		//this will override the Math function to give a different number
		Math math = new Math();
		MathNums mathNums = new MathNums();
		int x = math.magicMultiply(5);
		System.out.println("Math 5 times magic number is " + x);
		x = mathNums.magicMultiply(5);
		System.out.println("MathNums 5 times magic number is " + x);
	}
}
