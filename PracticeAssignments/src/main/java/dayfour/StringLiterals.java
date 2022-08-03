package dayfour;

public class StringLiterals {
	public static void main(String args[]) {
		// types of ways to declare a string
		String str1 = "HCL"; // checks is in the string constant object
		String str2 = "HCL"; // also checks, but if already present does not create new object
		
		String str3 = new String("HCL"); // creates object in the heap out of the SCP
		String str4 = new String("HCL"); // does not check if the object is already in the heap, creates another object
		
		//== checks for the object references, not the actual content
		
		//referencing the same object so true
		System.out.println(str1 == str2);
		
		//not the same object, false
		System.out.println(str1 == str3);
		
		//not the same object, false
		System.out.println(str3 == str4);
		
		//compares the actual content of the strings, not the reference, true
		System.out.println(str3.equals(str4));
		
		//ignores letter case to check for base values
		System.out.println(str3.equals(str4));
		
	}

}
