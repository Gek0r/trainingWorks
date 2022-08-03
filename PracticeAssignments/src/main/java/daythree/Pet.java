package daythree;

public class Pet extends Owner{
	String name = null;
	int age = 0;
	
	public String getName() {
		return name;
	}
	public void setPetName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setPetAge(int age) {
		this.age = age;
	}
	public void returnPetDetails()
	{
		System.out.println("Pet Name is " + name);
		System.out.println("Pet Age is " + age);
		
	}
	
}
