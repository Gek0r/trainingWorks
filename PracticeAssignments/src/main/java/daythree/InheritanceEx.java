package daythree;

public class InheritanceEx {
	// 1) Write a program for Inheritance example
	//This example has Pet  inherit the basics of the Owner class in order to deliver more information
	public static void main(String args[]) {
		//pet is an extension of owner
		Pet pet = new Pet();
		//set the pets info
		pet.setPetAge(3);
		pet.setPetName("Fluffy");
		//inherit the methods of the owner class
		pet.setOwnerAge(36);
		pet.setOwnerName("Bob");
		//uses both own and inherited functions 
		pet.returnPetDetails();
		pet.returnOwnerDetails();
}


}

