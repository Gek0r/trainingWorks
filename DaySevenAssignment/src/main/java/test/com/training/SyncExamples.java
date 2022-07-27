package test.com.training;

class Money {
	private int balance = 0;

	public synchronized void addBalance(int x) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

		}
		for (int i = 1; i <= x; i++) {
			balance += i;
		}
		System.out.println("Balance is now " + balance  + " " + Thread.currentThread().getName());
	}
}

class Account implements Runnable {
	Money obj;

	public Account(Money m) {
		obj = m;
	}

	public void run() {
		obj.addBalance(10);
	}
}

public class SyncExamples {

	public static void main(String[] args) {
		// This is an example of a synced thread
		Money m1 = new Money();
		Account a1 = new Account(m1);

		Thread t1 = new Thread(a1, "Thread One");
		Thread t2 = new Thread(a1, "Thread Two");
		Thread t3 = new Thread(a1, "Thread Three");

		t1.start();
		t2.start();
		t3.start();

	}

}