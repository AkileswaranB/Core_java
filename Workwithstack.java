package collections;
import java.util.*;
public class Workwithstack {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack= new Stack<>();
		int flag = 1;
		while(true){
			if(flag==0)break;
			System.out.println("Enter your choice \n 1.Push the element  2.Pop the element  3.Peek the element  4.search the element  5.Exit");
			int choice = scanner.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the stack elements to be pushed and enter -1 to stop");
				while(true){
					int value = scanner.nextInt();
					if(value==-1)break;
					else stack.push(value);
				}
				break;
			case 2:
				System.out.println("The poped element is : "+stack.pop());
				break;
			case 3:
				System.out.println("The peeked element is :"+stack.peek());
				break;
			case 4:
				System.out.println("Enter the element to be searched : ");
				int searchvalue = scanner.nextInt();
				System.out.println("The element "+searchvalue+" is present at "+stack.search(searchvalue));
				break;
			case 5 :
				flag = 0;
				break;
			}
		}
	}
}
