//Java progrom to work with collections stack....

import java.util.*;
class Data{
    int top=-1;
    char a[];
    int s;
    Data(int x){
        a=new char[x];
        s=x;
    }
    void push(char data){
        if(top != s-1){
            top++;
            a[top]=data;
        }
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(a[i]);
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        int x = str.length();
        Data d= new Data(x);
        for(int i=0;i<x;i++){
            char a = str.charAt(i);
            d.push(a);
        }
        d.display();
    }
}
