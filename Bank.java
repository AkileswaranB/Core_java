package oops;
import java.util.*;
class Users{
	//User attributes...
	private String username;
	private String address;
	private long accountnumber;
	private long userbalance;
	
	//Constructor..
	public Users(String name,long no ,String add , long bal){
		this.username      = name;
		this.accountnumber = no;
		this.address       = add;
		this.userbalance   = bal;
	}
	
	
	//Setter method to assign the user data..
	public void setusername(String name){
		this.username = name;
	}
	public void setaccountnumber(long num){
		this.accountnumber = num;
	}
	public void setuserbalance(long bal){
		this.userbalance = bal;
	}
	public void setaddress(String city){
		this.address = city;
	}
	
	
	//Getter method to get the user data..
	public String getusername(){
		return this.username;
	}
	public String getAddress(){
		return this.address;
	}
	public long getaccountnumber(){
		return this.accountnumber;
	}
	public long getuserbalance(){
		return this.userbalance;
	}
	
	
	
	//To add the amount to the user account balance..
	public void deposite(long amt){
		this.userbalance = userbalance + amt;
	}
	
	
	//To withdraw the amount from the user account..
	public void withdraw(long amt){
		if(this.userbalance-amt>=0){
			this.userbalance -= amt;
		}
		else System.out.println("Sorry ,Insufficient Balance..");
	}
	
	
	//To see the user data...
	public void profile(){
		System.out.println("Your user name is "+this.username+"\n Your Account Number is "+this.accountnumber);
		System.out.println("Your address is : "+this.address);
	}
}

public class Bank {
	
	//ArrayList to store the account.
	public ArrayList<Users> accountlist = new ArrayList<Users>();
	
	
	//To create the user for the first time..
	public void adduser(String name , String address , long accno , long balance){
		Users user = new Users(name,accno,address,balance);
		accountlist.add(user);
		//System.out.println(accountlist.size());
		//System.out.println(user.getuserbalance()+" "+user.getusername());
	}
	
	
	//To deposit the amount to the userAAccount..
	public void deposit(Long amt , long accountnum){
		int flag = 1;
		for(Users user : accountlist){
			long accno = user.getaccountnumber();
			System.out.println(accno);
			if(accno == accountnum){
				user.deposite(amt);
				flag = 0;
			}
		}
		if(flag==1)System.out.println("Sorry,user account not found ");
	}
	
	//To withdraw the amount from account balance..
	public void withdraw(long amt , long accountnum){
		int flag = 1;
		for(Users user : accountlist){
			long accno = user.getaccountnumber();
			if(accno == accountnum){
				user.withdraw(amt);
				flag = 0;
			}
		}
		if(flag==1)System.out.println("Sorry,user account not found ");
	}

	//To see the user details..
	public void seeprofile(long accountnum){
		int flag = 1;
		for(Users user : accountlist){
			long accno = user.getaccountnumber();
			if(accno == accountnum){
				user.profile();
				flag = 0;
			}
		}
		if(flag==1)System.out.println("Sorry,user account not found ");
	}
	
	
	//To see the user balance ..
	public void seebalance(long accountnum){
		int flag = 1;
		for(Users user : accountlist){
			long accno = user.getaccountnumber();
			if(accno == accountnum){
				System.out.println(user.getuserbalance());
				flag = 0;
			}
		}
		if(flag==1)System.out.println("Sorry,user account not found ");
	}
	
	//To see the available user in the system..
	public void seeusers(){
		int flag = 1;
		System.out.println(accountlist.size());
		for(Users user : accountlist){
				System.out.println(user);
				flag = 0;
		}
		if(flag==1)System.out.println("Sorry,no user found ");
	}
	
	//Main method...
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Bank management process...");
		int flag = 1;
		while(true){
			if(flag==0)break;
			
			System.out.println("Enter your choice 1.To open Account  2.depositamount  3.Withdrawamount  4.ViewBalance 5.To see the users  6.Exit\n");
			
			int choice = scanner.nextInt();
			Bank bank = new Bank();
			
			switch(choice){
			
			case 1:
				System.out.println("Enter the username , user address , user accountnumber , user balance");
				scanner.nextLine();
				String name = scanner.nextLine();
				String address = scanner.nextLine();
				long accountno = scanner.nextLong();
				long accbalance= scanner.nextLong();
				bank.adduser(name, address, accountno, accbalance);
				System.out.println("The user Account was successfully created...");
				break;
			
			case 2:
				System.out.println("Enter the account number and amount to be deposited ");
				scanner.nextLine();
				long accountnumb = scanner.nextLong();
				long depositamout= scanner.nextLong();
				bank.deposit(depositamout , accountnumb);
				System.out.println("The amount was successfully deposited ");
				break;
			
			case 3:
				System.out.println("Enter the account number and amount to be withdrawed");
				scanner.nextLine();
				long accountnumb1 = scanner.nextLong();
				long depositamout1= scanner.nextLong();
				bank.withdraw(depositamout1 , accountnumb1);
				break;
			
			case 4:
				System.out.println("Enter the account number");
				scanner.nextLine();
				long accountnumb2 = scanner.nextLong();
				bank.seebalance(accountnumb2);
				break;
				
			case 5:
				bank.seeusers();
				break;
				
			case 6:
				flag = 0;
				break;
			}
		}
	}
}
