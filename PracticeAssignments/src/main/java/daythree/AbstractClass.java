package daythree;


public class AbstractClass {
	//this shows how abstract classes work
	public static void main(String args[])
	{
		Lime juice = new Juice();
		juice.color();
	}
}

abstract class Lime
{
	public abstract void color();
}

class Juice extends Lime
{

	public void color() {
		System.out.println("The juice is green");
	}
	
}
