//Java program to find the odd or even using multithreading...

package multithreading;

import java.util.Scanner;

public class Workwiththread1 extends Thread{
	public static  int MAX_NUMBER = 20;
	private static Object lock = new Object();
	private static boolean isEvenTurn = true;  

	@SuppressWarnings("resource")
	public static void main(String args[]){  
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lastnumber to find the odd and even : ");
		int fv = scanner.nextInt();
		MAX_NUMBER = fv;
		Thread evenThread = new Thread(() -> {
			for (int i = 2; i <= MAX_NUMBER; i += 2) {
				synchronized(lock) {
					while (!isEvenTurn) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Even Number from evenThread: " + i);
					isEvenTurn = false;
					lock.notify();
				}
			}
		});

		Thread oddThread = new Thread(() -> {
			for (int i = 1; i <= MAX_NUMBER; i += 2) {
				synchronized(lock) {
					while (isEvenTurn) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Odd Number from oddThread: " + i);
					isEvenTurn = true;
					lock.notify();
				}
			}
		});

		evenThread.start();
		oddThread.start();
	}
}