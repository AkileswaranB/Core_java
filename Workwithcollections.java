//Collections inbuilt methode in the arraylist...
package oops;

import java.util.*;
public class Workwithcollections {
	static ArrayList<Integer> list = new ArrayList<>();
	
	public void found(int value){
		if(list.contains(value)){
			System.out.println("The Element "+value+" was founf at the index of "+list.indexOf(value));
		}
		else System.out.println("The Element not found");
	}
	
	public void remove(int value){
		if(list.contains(value)){
			list.remove(Integer.valueOf(value));
			System.out.println("The element was successfully deleted");
		}
		else System.out.println("The Element not found");
	}
	
	public void replace(int replacingvalue, int replaceablevalue){
		int position = list.indexOf(replaceablevalue);
		list.set(position, replacingvalue);
	}
	
	
	@SuppressWarnings({ "resource" })
	public static void main(String args[]){
		Workwithcollections obj = new Workwithcollections();
		list.clear();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements to be added to the Arraylist");
		int size = scanner.nextInt();
		for(int i=0;i<size;i++){
			list.add(scanner.nextInt());
		}
		System.out.println("Enter the element to be found from the Arraylist");
		int value  = scanner.nextInt();
		obj.found(value);
		
		System.out.println("Enter the element to be deleted from Arraylist");
		value  = scanner.nextInt();
		obj.remove(value);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i=1;i<5;i++){
			list2.add(i);
		}
		
		System.out.println("Using the collections inbuilt methode to add the two arrayLists ,after the process the array values are ");
		list.addAll(list2);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println("Using the collections inbuilt methode to replace the element in the arraylist ");
		System.out.println("Enter the replacing and valuevalue to be replaced ");
		int replacingvalue  = scanner.nextInt();
		int replaceablevalue= scanner.nextInt();
		obj.replace(replacingvalue, replaceablevalue);
		
		
		System.out.println("The arrayList after the element have been replacement ");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("The size of the list is : "+list.size());
		
		
		//It is used to sort the arraylist...
		Collections.sort(list);
		
		if(!list.isEmpty()){
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i)+" ");
			}
		}
		
	}
}
