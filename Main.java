// Java program to work with staff management...
import java.util.*;
class Person {
    String name;
    Person(){
    }
    public void setname(String data){
        this.name = data;
    }
    public String getname(){
        return name;
    }
    
}
class Staff extends Person{
    int id;
    Staff(){
    }
    public void setid(int Id){
        this.id = Id;
    }
    public int getid(){
        return id;
    }
}
class TemporaryStaff extends Staff{
    int days;
    int hours;
    TemporaryStaff(){
        this.days = 0;
        this.hours= 0;
    }
    public void setname(String data){
        this.name = data;
    }
    public void setid(int data){
        this.id = data;
    }
    public void setday(int data){
        this.days = data; 
    }
    public void sethour(int data){
        this.hours = data;
    }
    
    public int getday(){
        return days;
    }
    public int gethours(){
        return hours;
    }
    
    public void print(){
        System.out.println("Name : "+name);
        System.out.println("Staff Id : "+id);
        System.out.println("No. of Days : "+days);
        System.out.println("No. of Hours Worked : "+hours);
        System.out.println("Total Salary : "+(days * hours * 50));
    }
}
class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
         int id = sc.nextInt();
         int day = sc.nextInt();
         int hours = sc.nextInt();
         Person obj = new Person();
         obj.setname(name);
         Staff obj1 = new Staff();
         obj1.setid(id);
         TemporaryStaff obj2 = new TemporaryStaff();
         obj2.setday(day);
         obj2.sethour(hours);
         obj2.setname(name);
         obj2.setid(id);
         obj2.print();
    }
}
