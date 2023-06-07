//Java program to maintain the creditsale details using oops concepts like class , object , inheritance ,Encapsulation , polymorphism's methode overloading...

package oops;
import java.util.*;

class ExpenseandCredited{
	
	private String name;
	private String reason;
	private Float  amount;
	
	//Constructor to create object for expense list...
	public ExpenseandCredited(String name,String reason , Float amt){
		this.name  = name;
		this.reason= reason;
		this.amount= amt;
	}
	
	//Constructor to create object for Credited list...
	public ExpenseandCredited(Float amt , String name,String reason){
		this.name  = name;
		this.reason= reason;
		this.amount= amt;
	}
	
	//Setter method to store the details of name , reason , amount .
	public void setname(String name){
		this.name= name;
	}
	public void setreason(String reason){
		this.reason  = reason;
	}
	public void setamount(Float amt){
		this.amount= amt;
	}
	
	//Getter method to get the details of name , reason , amount .
	public String getname(){
		return  this.name;
	}
	public String getreason(){
		return this.reason;
	}
	public Float getamount(){
		return this.amount;
	}

}

public class Creditsale {
	public static float availablebalance = 0; 
	
	//Separate ArrayList to maintain the Expense details and Income details..
	public ArrayList<ExpenseandCredited> Expenselist = new ArrayList<ExpenseandCredited>();
	public ArrayList<ExpenseandCredited> CreditList  = new ArrayList<ExpenseandCredited>();
	
	//To add the expense details.
	public void addexpense(String name , String reason ,Float amt){
		if(availablebalance-amt > 0 ){
			ExpenseandCredited expense = new ExpenseandCredited(name , reason , amt);
			Expenselist.add(expense);
			availablebalance -= amt;
		}
		else{
			System.out.println("Sorry , Insufficient balance...");
		}
	}
	
	//To print the expense details.
	public void showexpenselist(){
		for(ExpenseandCredited expense : Expenselist){
			System.out.println("You have paid "+expense.getamount()+" Rs for "+expense.getreason()+" in "+expense.getname());
		}
	}
	
	//To add the Income details.
	public void addCreditdetails( String name, String reason , Float amt){
		ExpenseandCredited Crediteddetails = new ExpenseandCredited(amt , name , reason );
		CreditList.add(Crediteddetails);
		availablebalance += amt;
	}
	
	//To print the Income details.
	public void showCreditedList(){
		for(ExpenseandCredited creditlist : CreditList){
			System.out.println("The person "+creditlist.getname()+" have paid you "+creditlist.getamount()+" Rs for "+creditlist.getreason());
		}
	}
	
	//To add the amount to the available balance.
	public void addbalance(Float amt){
		availablebalance += amt;
	}
	
	//To print the available Balanace.
	public float showbalance(){
		return availablebalance;
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Credit sale management \nPlease enter your current balance :");
		availablebalance= scanner.nextInt();
		int flag = 1;
		
		Creditsale details = new Creditsale();
		
		//Switch to get user choice and call the respective method to do the task...
		while(true){
			if(flag==0)break;
			
			System.out.println("Enter your choice \n1.Toadd Expense  2.Toadd Income  3.ToShow expenselist  4.ToShow Incomelist  5.ToShow Balance  6.addbalance 7.Exits");
			int choice  = scanner.nextInt();
			
			switch(choice){
			case 1 :
				System.out.println("Enter the expensetype , expensereason , expenseamount .");
				scanner.nextLine();
				String expensetype  = scanner.nextLine();
				String expensereason= scanner.nextLine();
				Float  expenseamount= scanner.nextFloat();
				details.addexpense(expensetype , expensereason , expenseamount);
				break;
			case 2 :
				System.out.println("Enter the Creditpersonname , Creditedreason , Creditedamount .");
				scanner.nextLine();
				String Creditedtype  = scanner.nextLine();
				String Creditedreason= scanner.nextLine();
				Float  Creditedamount= scanner.nextFloat();
				details.addCreditdetails(Creditedtype , Creditedreason , Creditedamount);
				break;
				
			case 3 :
				details.showexpenselist();
				break;
				
			case 4 :
				details.showCreditedList();
				break;
				
			case 5:
				System.out.println(details.showbalance());
				break;
				
			case 6:
				System.out.println("Enter the amount to be added to the main balance ");
				Float amt = scanner.nextFloat();
				details.addbalance(amt);
				break;
				
			case 7 :
				flag = 0;
				break;
				
			default :
				System.out.println("Enter the Correct Choice ");
				break;
			}
			
		}
		
	}
}
