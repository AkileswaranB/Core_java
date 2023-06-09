//Java program to get element for vectore and to convert it to array...
package collections;
import java.util.*;
public class Vectortoarray {
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the vectore : ");
		int vectorsize  = scanner.nextInt();
		
		Vector<Integer> vectorlist = new Vector<Integer>(vectorsize);
		System.out.println("Enter the vector value :");
		
		for(int i=0;i<vectorsize;i++){
			vectorlist.add(scanner.nextInt());
		}
		
		Object[] array = vectorlist.toArray();
		
		System.out.println("The array values are  : ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");;
		}
	}
}
