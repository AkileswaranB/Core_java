//Java program to work with the Hashmap...

package collections;
import java.util.*;
public class WorkwithHashmap {
	public static void main(String args[]){
		
		//Scanner object to use the inbuilt input methods...
		Scanner scanner  = new Scanner(System.in);
		
		//Creation of empty hash map..
		Map<Integer, Integer> hashmap= new HashMap<Integer, Integer>();
		
		int flag = 1;
		
		while(true){
			
			if(flag==0)break;
			
			System.out.println("Enter your choice \n 1.add the element  2.remove the element  3.delete all the elements  4.find the element  5.print the hashmap  6.Exit");
			int choice = scanner.nextInt();
			
			switch(choice){
			
			case 1:
				System.out.println("Enter the set index and elements to be inserted and enter -1 to stop");
				while(true){
					int index = scanner.nextInt();
					int value = scanner.nextInt();
					if(value==-1)break;
					else hashmap.put(index,value);
				}
				break;
			
			case 2:
				System.out.println("Enter the elements index to be removed ");
				int value = scanner.nextInt();
				System.out.println("The removed element is : "+hashmap.remove(value));
				break;
			
			case 3:
				hashmap.clear();
				System.out.println("The hashmap values are deleted");
				break;
			
			case 4:
				System.out.println("Enter the value to be found : ");
				value = scanner.nextInt();
				System.out.println("The element present in the hashmap is : "+hashmap.containsValue(value));
				break;
			
			case 5 :
				for (Map.Entry<Integer, Integer> hm :
		            hashmap.entrySet()) {
		            System.out.println("The value "+hm.getValue()+" is present at "+hm.getKey());
		        }
				break;
			case 6 :
				flag = 0;
				break;
			
			}
		}
	}
}
