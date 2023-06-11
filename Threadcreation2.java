//Thread creation using the Runnable interface....
package multithreading;

import java.util.*;

public class Threadcreation2  implements Runnable {
	public void run(){  
		System.out.println("I have created the first thread and it's running...");  
	} 
	public static void main(String args[]){ 
		
		Threadcreation2 tc2=new Threadcreation2(); 
		Thread t1 =new Thread(tc2); 
		t1.start();  
	}  
}
