package oops;
import java.util.*;

class Student {
  private String name;
  private int grade;
  private ArrayList < String > courses;

  public Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
    this.courses = new ArrayList < String > ();
  }

  public String getName() {
    return name;
  }
  public int getGrade() {
    return grade;
  }
  public ArrayList<String> getCourses() {
    return courses;
  }

  public void addCourse(String course) {
    courses.add(course);
  }
  public void removeCourse(String course) {
    courses.remove(course);
  }
  
  
  public void printStudentDetails() {
    System.out.println("Name: " + name);
    System.out.println("Grade: " + grade);
  }

}
public class Studentmanagement {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the student management ");
		Studentmanagement studentmanagement = new Studentmanagement();
			String name = scanner.nextLine();
			int grade= scanner.nextInt();
			Student student1 = new Student(name , grade);
			System.out.println("Student Details:");
			student1.printStudentDetails();
			System.out.println("Adding courses for " + student1.getName());
			student1.addCourse("Java");
			student1.addCourse("DBMS");
			student1.addCourse("HTML");
			student1.removeCourse("HTML");
			System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
		}
}