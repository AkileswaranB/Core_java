//Java program to create a thread and to print its id...

package multithreading;

import java.util.Scanner;

class Multithread implements Runnable {
	public void run()
	{
		try {
			Thread.sleep(500);
			System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

class Threadcreation3 {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int noofthread = scanner.nextInt();
		for (int i = 0; i < noofthread; i++) {
			Thread object= new Thread(new Multithread());
			object.start();
		}
	}
}
