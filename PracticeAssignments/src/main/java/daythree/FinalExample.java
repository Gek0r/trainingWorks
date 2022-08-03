package daythree;

public class FinalExample {
	Final last = new Final();
	LockedMethods lock = new LockedMethods();
	LockedVars var = new LockedVars();
	
}

class LockedMethods
{
	final void testOut()
	{
		System.out.println("This can not be changed");
	}
}

class LockedVars
{
	final int GOAL = 1000;
	int score = 1000;
	final void varOut()
	{
		System.out.println("GOAL can not be changed, but score can");
	}
	
	void setScore(int x)
	{
		score = x;
	}
}