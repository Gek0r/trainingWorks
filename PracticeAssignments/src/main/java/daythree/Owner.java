package daythree;

public class Owner {
	private String name = null;
	private int age = 0;
	
	//basic return
	void returnOwnerDetails() {
		System.out.println("The Owner's name is: " + name);
		System.out.println("The Owner's age is: " + age);
	}
	
	
	
	
	//basic getter
	public String getName() {
		return name;
	}
	//basic setter
	public void setOwnerName(String name) {
		this.name = name;
	}
	//basic getter
	public int getAge() {
		return age;
	}
	//basic setter
	public void setOwnerAge(int age) {
		this.age = age;
	}
}
