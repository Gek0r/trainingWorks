package daythree;

public class OverloadExamples {

	public static void main(String[] args) {
		Math test = new Math();
		//overloaded methods
		//add(int x, int y)
		System.out.println("Overloaded method one = " + test.add(1, 2));
		//add(int x, int y, int z)
		System.out.println("Overloaded method two = " + test.add(1, 2, 3));
		//add(int w, int x, int y, int z)
		System.out.println("Overloaded method three = " + test.add(1, 2, 3, 4));
		
		//constructor overloads
		Car sentra = new Car();
		//Basic constructor
		
		System.out.println("Basic car no overload");
		sentra.info();
		sentra = new Car("Sentra");
		System.out.println("Basic car name overload");
		sentra.info();
		System.out.println("Basic car name overload");
		sentra.info();
		

	}

}
