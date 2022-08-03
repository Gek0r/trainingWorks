package dayFive.com.usk.test;

public class PassByExamples {

	public static void main(String[] args) {
		//Swap by Value
		Value val = new Value(10, 20);
		
		System.out.println("This will swap by Value these two values valOne: " + val.valOne + " and valTwo: " + val.valTwo);
		
		//now create value swap and send
		val.swap(val.valOne, val.valTwo);
		
		System.out.println("After value swapping, valOne is " + val.valOne  + " and valTwo is " + val.valTwo);
		
		//Swap by Reference
		Reference ref = new Reference(15,30);
		
		System.out.println("This will swap by Reference these two values valOne: " + ref.valOne + " and valTwo: " + ref.valTwo);
		
		//now create reference swap and send
		ref.swap(ref);
		
		System.out.println("After reference swapping, valOne is " + ref.valOne + " and valTwo is " + ref.valTwo);
	}

}

class Value {
	int valOne = 0;
	int valTwo = 0;

	Value(int x, int y) {
		valOne = x;
		valTwo = y;
	}

	void swap(int x, int y) {
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
	}
}

class Reference {
	int valOne = 0;
	int valTwo = 0;

	Reference(int x, int y) {
		valOne = x;
		valTwo = y;
	}

	void swap(Reference ref) {
		int temp;
		temp = ref.valOne;
		ref.valOne = ref.valTwo;
		ref.valTwo = temp;
	}

}