//Java progrma to work with the inbuilt methods of the collection's linkedlist...

package collections;
import java.util.*;
public class Singlylinkedlist {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be added to the linkedlist : ");
		int size = scanner.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("Enter the list values : ");
		for(int i=0;i<size;i++){
			list.add(scanner.nextInt());
		}
		
		System.out.println("The list value are : ");
		for(int i=0;i<size;i++){
			System.out.print(list.get(i));
		}
		
		
		System.out.println("The inbuilt methods in the linked list are \n1.To add first  2.To add last  3.To clear list  4.To get firstelement  5.To get lastelement  6.To find indexof element 7.Exit \n Enter your choice ");
		int flag = 1;
		while(true){
			
			if(flag==0)break;
			int choice = scanner.nextInt();
			
			switch(choice){
			
			case 1:
				System.out.println("Enter the element to be added first of the list");
				int element  = scanner.nextInt();
				list.addFirst(element);
				System.out.println("The list value are : ");
				for(int i=0;i<size;i++){
					System.out.print(list.get(i));
				}
				break;
				
			case 2:
				System.out.println("Enter the element to be added Last of the list");
				element  = scanner.nextInt();
				list.addLast(element);
				System.out.println("The list value are : ");
				for(int i=0;i<size;i++){
					System.out.print(list.get(i));
				}
				break;
				
			case 3 :
				list.clear();
				System.out.println("The list value after the clear methode are : ");
				for(int i=0;i<size;i++){
					System.out.print(list.get(i));
				}
				break;
				
			case 4 :
				System.out.println("The first element of the list is  : "+list.getFirst());
				break;
				
			case 5 :
				System.out.println("The last element of the list is  : "+list.getLast());
				break;
				
			case 6 : 
				System.out.println("Enter the element to find the index of the element ");
				element  = scanner.nextInt();
				if(list.indexOf(element)!=-1){
					System.out.println("The element "+element+" is found at the index of "+list.indexOf(element)+" in the list");
				}
				else System.out.println("The element not found");
				break;
				
			case 7:
				flag =  0;
				break;
				
			}
		}
	}
}
