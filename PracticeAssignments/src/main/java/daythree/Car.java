package dayFour.com.usk.test;

public class Car {
	


	String name = null;
	int year = 0;
	Car()
	{
		
	}
	Car(String name)
	{
		this.name = name;
	}
	
	Car(String name, int year)
	{
		this.name = name;
		this.year = year;
	}

	
	public void info()
	{
		System.out.println("Name = " + name);
		System.out.println("Year = " + year);
	}
}
