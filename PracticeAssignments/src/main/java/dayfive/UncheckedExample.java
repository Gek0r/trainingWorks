package dayfive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class UncheckedExample {
	public static void main(String[] args) {
		// An example of handling an exception that does not get caught at compile time
		
		try
		{
			Dog dog = new Dog(15, "Fido");
			dog.setName(args[2]);
			System.out.println(dog.getName());
		}
		catch(Exception err)
		{
			System.out.println("Exception Message: " + err.getMessage());
			err.printStackTrace();
		}
		
		
	}
}


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
class Dog
{
	int age;
	String name;
	
}