package collections;
//Java program to work with the Collections Queue...

import java.util.*;
public class Workwithqueue{
	@SuppressWarnings("resource")
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Queue ....");
		Queue<Integer> que= new LinkedList<>();
		int flag = 1;
		
		while(true){
			
			if(flag==0)break;
			
			System.out.println("Enter your choice \n 1.add the element  2.remove the element  3.Peek the element  4.print and remove the element  5.Exit");
			int choice = scanner.nextInt();
			
			switch(choice){
			
			case 1:
				System.out.println("Enter the Queue elements to be inserted and enter -1 to stop");
				while(true){
					int value = scanner.nextInt();
					if(value==-1)break;
					else que.add(value);
				}
				break;
			
			case 2:
				System.out.println("The poped element is : "+que.remove());
				break;
			
			case 3:
				System.out.println("The peeked element is :"+que.peek());
				break;
			
			case 4:
				System.out.println("The first element of the Queue is : "+que.poll());
				break;
			
			case 5 :
				flag = 0;
				break;
			
			}
		}
	}
}
