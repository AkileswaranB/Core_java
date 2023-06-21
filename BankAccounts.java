//Java program to work with Bank accounts.....

import java.util.*;

class Account{
    protected String accName;
    protected String accNo;
    protected String bankName;
    
    public void setaccname(String data){
        this.accName = data;
    }
    public void setaccno(String data){
        this.accNo   = data;
    }
    public void setbankname(String data){
        this.bankName = data;
    }
    
    public String getname(){
        return accName;
    }
    public String getno(){
        return accNo;
    }
    public String getbankname(){
        return bankName;
    }
    public void display(){
        System.out.println(accName+" "+accNo+" "+bankName);
    }
}
class CurrentAccount extends Account{
    private String tinNumber;
    CurrentAccount(){
        this.tinnumber = "";
    }
    CurrentAccount(String name,String no,String bname,String tin){
        this.accName = name;
        this.accNo = no;
        this.bankName = bname;
        this.tinNumber= tin;
    }
    public String getName(){
        return accName;
    }
    public String getNo(){
        return accNo;
    }
    public String getbname(){
        return bankName;
    }
    public String gettin(){
        return tinNumber;
    }
    
    public void display(){
        System.out.println(accName+"\n"+accNo+"\n"+bankName+"\n"+tinNumber);
    }
}
class SavingsAccont extends Account{
    private String orgName;
    SavingsAccount(){
        this.orgname = "";
    }
    SavingsAccount(String name,String no,String bname,String oname){
        this.accName = name;
        this.accNo   = no;
        this.bankName= bname;
        this.orgName = oname;
    }
    public String getname(){
        return accName;
    }
    public String getno(){
        return accNo;
    }
    public String getbname(){
        return bankName;
    }
    public String getorgname(){
        return orgName;
    }
    
    public void display(){
        System.out.println(accName+"\n"+accNo+"\n"+bankName+"\n"+orgName);
    }
}
class BankAccounts{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int fv = s.nextInt();
        String name = s.next();
        String no   = s.next();
        String bname= s.next();
        String tinNumber = s.next();
        if(fv==1){
            System.out.println(name+" "+no+" "+bname+" "+tinNumber);
            CurrentAccount ca= new CurrentAccount(name,no,bname,tinnumber); 
            ca.display();
        }
        else{
            SavingsAccount sa= new SavingsAccount(name,no,bname,tinnumber);
            sa.display();
        }
    }
}
