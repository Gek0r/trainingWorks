package dayFour.com.usk.test;

public class Interface {
	public static void main(String args[])
	{
		Polly polly = new Polly();
		Wasabi wasabi = new Wasabi();
		polly.type();
		polly.size();
		wasabi.type();
		wasabi.size();
	}
	//this shows an example of interface
}

interface Bird
{
	void size();
	void type();
}


class Polly implements Bird {

	@Override
	public void size() {
		
		System.out.println("I am a small bird!");
	}

	@Override
	public void type() {
		
		System.out.println("I am a Parakeet named Polly!");
	}

	
}

class Wasabi implements Bird {

	@Override
	public void size() {
		
		System.out.println("I am medium sized bird!");
	}

	@Override
	public void type() {
		
		System.out.println("I am a Quaker Parrot named Wasabi!");
	}

	
}