//Thread creation using the thread class....
package multithreading;

import java.util.*;

public class Threadcreation1 extends Thread {
	public void run(){  
		System.out.println("I have created the first thread and it's running...");  
	} 
	public static void main(String args[]){  
		
		Threadcreation1 t1=new Threadcreation1();  
		t1.start();  
	}  
}
