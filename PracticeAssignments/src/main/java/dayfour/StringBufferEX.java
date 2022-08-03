package dayfour;

public class StringBufferEX {

	public static void main(String[] args) {
		// stringbuffer is a mutable class
		// it is safer for making more changes
		// dynamic length, allocates extra bytes
		// synchronized
		
		StringBuffer sb = new StringBuffer("Welcome to stringbuffer...");
		
		System.out.println(sb);
		System.out.println(sb.append(" members"));
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.insert(10, " my new "));
		System.out.println(sb.delete(6, 10));
		System.out.println(sb.reverse());

	}

}
