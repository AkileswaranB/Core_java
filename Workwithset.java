//Java program to work with the Collection's Set...

package collections;
import java.util.*;
public class Workwithset {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		
		//Scanner object to use the inbuilt input methods...
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Set in java ....");
		
		//Creation of hash set..
		Set<Integer> hash_Set = new HashSet<>();
		int flag = 1;
		
		while(true){
			
			if(flag==0)break;
			
			System.out.println("Enter your choice \n 1.add the element  2.remove the element  3.delete all the elements  4.find the element  5.Exit");
			int choice = scanner.nextInt();
			
			switch(choice){
			
			case 1:
				System.out.println("Enter the set elements to be inserted and enter -1 to stop");
				while(true){
					int value = scanner.nextInt();
					if(value==-1)break;
					else hash_Set.add(value);
				}
				break;
			
			case 2:
				System.out.println("Enter the elements to be removed ");
				int value = scanner.nextInt();
				System.out.println("The removed element is : "+hash_Set.remove(value));
				break;
			
			case 3:
				hash_Set.clear();
				System.out.println("The set values are :"+hash_Set);
				break;
			
			case 4:
				System.out.println("Enter the value to be found : ");
				value = scanner.nextInt();
				System.out.println("The element present in the set is : "+hash_Set.contains(value));
				break;
			
			case 5 :
				flag = 0;
				break;
			
			}
		}
	}
}
