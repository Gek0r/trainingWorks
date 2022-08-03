package dayFive.com.usk.test;

public class StringExamples {

	public static void main(String[] args) {
		// String literal
		String str = "Hello world!";

		// String of new object
		String newStr = new String("Hello world!");

		// They are not the same thing by reference, but are by content
		System.out.println("str ==  newStr : " + str == newStr);
		System.out.println("str.equals(newStr) : " + str.equals(newStr));

		// some examples of String methods
		System.out.println(str.concat(" Also this new object says; ").concat(newStr));
		System.out.println(str.charAt(3));
		System.out.println(str.toUpperCase());
		System.out.println(str.length());

		// StringBuffer
		StringBuffer buffer = new StringBuffer("Hello buffered string! I am synced up! ");

		// some examples of StringBuffer methods
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		System.out.println(buffer.reverse());
		System.out.println(buffer.reverse());
		System.out.println(buffer.append("Appending dynamically to the buffered string"));
		System.out.println(buffer.delete(10, 14));

		// StringBuilder
		StringBuilder builder = new StringBuilder("Hello builder string! I am not synced! ");

		// some examples of StringBuilder methods
		System.out.println(builder);
		System.out.println(builder.capacity());
		System.out.println(builder.length());
		System.out.println(builder.reverse());
		System.out.println(builder.reverse());
		System.out.println(builder.append("Appending dynamically to the built string"));
		System.out.println(builder.delete(10, 14));
	}

}
