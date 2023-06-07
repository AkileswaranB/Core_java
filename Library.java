//A class called "Library" with a collection of books and methods to add and remove books.
//Here the class creation , object creation ,Inheritance of the classes ,encapsulation , Collections ArrayList are used...

package oops;

import java.util.*;

class Book{
	private String BookName;
	private String Author;
	private String Version;
	private float  price;
	
	public Book(String title, String author ,String version , float amt) {
	    this.BookName = title;
	    this.Author   = author;
	    this.Version  = version;
	    this.price    = amt;
	}
	
	//Setter method to assign the data to the respective fields...
	public void setTitle(String title) {
		this.BookName = title;
	}
	
	public void setAuthor(String author) {
		this.Author = author;
	}
	
	public void setVersion(String version) {
		this.Version = version;
	}
	
	public void setprice(float amt) {
		this.price = amt;
	}
	
	
	//Getter method to get the data...
	public String getTitle() {
		return BookName;
	}
	public String getAuthor() {
		return Author;
	}
	
	public String getVersion() {
		return Version;
	}
	
	public float getprice() {
		return price;
	}

}


class BookCollections{
	
	//Two Dimensional ArrayList to store the books based on the Alphabetical order.
	private ArrayList<ArrayList<Book>> Booklist = new ArrayList<ArrayList<Book>>();
	
	
	//Constructor for the BookCollections class to initialize the 26 dimensions for the 2D ArrayList.
	BookCollections(){
		for(int i=0;i<26;i++){
			Booklist.add(new ArrayList<Book>());
		}
	}
	
	//To add the books in the Racks of the Library.
	public void addbook(String name , String author ,String version , float price){
		//System.out.println(name +" "+ author+" "+ version+" "+ price);
		Book book = new Book(name , author, version , price);
		this.Booklist.get(name.charAt(0)-65).add(book);
	}
	
	//To Remove the books in the Racks of the Library.
	public void removebook(String data){
		int index=0,flag = 1;
		ArrayList<Book> books2 = Booklist.get(data.charAt(0)-65);
		for(Book book : books2){
			if(book.getTitle().equals(data)){
				this.Booklist.get(data.charAt(0)-65).remove(index);
				System.out.println("The Book "+data+" was successfull removed from the library..");
				flag = 0;
				break;
			}
		}	
		if(flag==1){
			System.out.println("The book "+data+" was not found...");
		}
	}
	
	//To Show the books in the Racks of the Library.
	public void getbooks(){
		int emptyrackcount = 0;
		for(int i=0;i<26;i++){
			if(Booklist.get(i).size()>0){
				System.out.println("The Books in  "+(char)(i+65)+" Rack =>  ");
				ArrayList<Book> books = Booklist.get(i);
				for(Book book : books){
					System.out.println("The Book "+book.getTitle()+" was written by "+book.getAuthor()+" with the version "+book.getVersion()+" and its price is "+book.getprice()+"Rs only...");
				}
				System.out.println();
			}
			else emptyrackcount++;
		}
		if(emptyrackcount>0)System.out.println("There are "+emptyrackcount+" emptyracks in the library...");
	}
	
	//To display the Number of Books in the Library...
	public int getNumberOfBooks(){
		int bookcount = 0;
		for(int i=0;i<26;i++){
			bookcount += this.Booklist.get(i).size();
		}
		return bookcount;
	}
	
}
public class Library {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Our Library....");
		
		//Creating the object for BookCollections class...
		BookCollections firstBookCollections = new BookCollections();
		
		while(true){
			
			//To get the User choice to work with the library...
			System.out.println("The choices are,  1.Toadd book  2.Todelete book  3.Todisplay the book  4.Toshow Number of Books  5.Exit\nEnter Your Choice : ");
			
			int choice = scanner.nextInt();
			if(choice == 1){
				System.out.println("Enter the Number of books to be added : ");
				int Numberofbooks = scanner.nextInt();
				System.out.println("Enter the BookName , AuthorName , BookVersion ,Bookprice ");
				scanner.nextLine();
				for(int i=0;i<Numberofbooks;i++){
					String bookname   = scanner.nextLine();
					String authorname = scanner.nextLine();
					String bookversion= scanner.nextLine();
					Float bookprice   = scanner.nextFloat();
					//System.out.println(bookname.charAt(1));
					firstBookCollections.addbook(bookname,authorname,bookversion,bookprice);
				}
			}
			else if(choice == 2){
				System.out.println("Enter the Number of books to be deleted : ");
				int Numberofbooks = scanner.nextInt();
				scanner.nextLine();
				for(int i=0;i<Numberofbooks;i++){
					String bookname = scanner.nextLine();
					firstBookCollections.removebook(bookname);
				}
			}
			else if(choice == 3){
				firstBookCollections.getbooks();
			}
			else if(choice == 4){
				System.out.println("The number of books in the Library : "+firstBookCollections.getNumberOfBooks());
			}
			else if(choice == 5){
				break;
			}
			else{
				System.out.println("Enter the correct choice...");
			}
		}
		
	}
}
