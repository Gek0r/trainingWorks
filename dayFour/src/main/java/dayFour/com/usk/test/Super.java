package dayFour.com.usk.test;

public class Super {
	//this will show the effects of the super keyword
	public static void main(String argsp[])
	{
		Paint paint = new Paint();
		paint.reference();
		paint.Primer();
	}
	
}
//parent class
class Primer{
	String color = "Gray";
	Primer()
	{
		System.out.println(color + " primer applied to object");
	}
	
	public void reference()
	{
		System.out.println("The color is of primer is " + color);
	}
}
//child class
class Paint extends Primer
{
	String color = "Red";
	Paint()
	{
		//call primer to be applied
		super();
		System.out.println(color + " paint is applied to object");
		
	}
	
	public void reference()
	{
		super.reference();
		System.out.println("The color is of paint is " + color);
	}
	public void Primer()
	{
		System.out.println(super.color);
	}
}