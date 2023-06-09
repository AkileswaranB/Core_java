//Java program to work with Priority Queue ....

package collections;
import java.util.*;

public class Workwithpriorityqueue {
	public static void main(String ags[]){
		@SuppressWarnings("resource")
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Priority Queue ....");
		PriorityQueue<Integer> pque = new PriorityQueue<>(Collections.reverseOrder());
		int flag = 1;
		
		while(true){
			
			if(flag==0)break;
			
			System.out.println("Enter your choice \n 1.add the element  2.remove the element  3.Peek the element  4.print and remove the element  5.Toremove all elements  6.Exit");
			int choice = scanner.nextInt();
			
			switch(choice){
			
			case 1:
				System.out.println("Enter the PriorityQueue elements to be inserted and enter -1 to stop");
				while(true){
					int value = scanner.nextInt();
					if(value==-1)break;
					else pque.add(value);
				}
				break;
			
			case 2:
				System.out.println("The poped element is : "+pque.remove());
				break;
			
			case 3:
				System.out.println("The peeked element is :"+pque.peek());
				break;
			
			case 4:
				System.out.println("The first element of the Queue is : "+pque.poll());
				break;
			
			case 5 :
				pque.clear();
				System.out.println("The Priority queue was successfully cleared and now the queue is empty ");
				break;
			case 6 :
				flag = 0;
				break;
			
			}
		}
	}
}
