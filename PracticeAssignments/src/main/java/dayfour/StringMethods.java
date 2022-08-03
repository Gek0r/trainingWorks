package dayfour;

public class StringMethods {

	public static void main(String[] args) {
		// our strings
		String str1 = "This is a string literal";
		String str2 = "HCL technologgies";
		//print specific chars
		System.out.println(str1.charAt(10));
		//add together strings
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(str2).concat("Test"));
		
		//check for substrings
		System.out.println(str1.contains("string"));
		System.out.println(str1.contains("asdasf"));
		//print substrings
		System.out.println(str1.substring(10));
		System.out.println(str1.substring(10, 16));
		
		
		System.out.println(str1.trim());
	}

}
