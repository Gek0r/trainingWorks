package test.com.training;

public class ThreadExamples {

	public static void main(String[] args) {
		
		//Some examples of threads for usage
		
		//This is a single thread that starts and prints numbers from 1 to 50
		Counter count = new Counter();
		count.start();
		
		//These threads print odd and even numbers separate
		Odd odd = new Odd();
		Even even = new Even();
		
		odd.start();
		even.start();

	}

}

class Counter extends Thread {
	public void run() {
		System.out.println("Starting single thread to count from 1 to 50");
		for (int i = 0; i <= 50; i++) {
			System.out.println(i);
		}

	}
}

class Even extends Thread {
	public void run() {
		System.out.println("Starting single thread to count even numbers from 1 to 50");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

class Odd extends Thread {
	public void run() {
		System.out.println("Starting single thread to count odd numbers from 1 to 50");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}