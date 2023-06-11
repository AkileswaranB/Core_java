//Java program to work with the thread inbuild method sleep()...

package multithreading;

public class Workwithsleepmethode extends Thread{
	
	public void run(){    
		for(int i=1;i<5;i++){     
			try{
				Thread.sleep(250);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}    
			System.out.println(i);    
		}    
	}    
	public static void main(String args[]){    
		
		Workwithsleepmethode t1=new Workwithsleepmethode();    
		Workwithsleepmethode t2=new Workwithsleepmethode();    

		t1.start();    
		t2.start();    
	}    
}    
