/*
Name :- Atharva Kinikar
Div :- SE10
Batch :- F10
Roll no :- 23241
OOPL Assignment 3 :- Polymorphism
*/

import java.util.Scanner; //importing scanner class
class Publications{ //declaring publication class
    //declaring variables of class publication
    String title; 
    double price;
    int copies;
    double bill;
    Scanner sc=new Scanner(System.in);
    int getcopies() //getcopies function to return copies
    {
        return this.copies;
    }
    void setcopies(int copies) //setcopies function to set copies
    {
        this.copies=copies;
    }
    void sellcopy(double total_price,int total_copies) //sellcopy function to display total sale of publication                 
    {
        System.out.println("*****************BILL*****************");
        System.out.println("Total Number Books and Magazines:"+total_copies);               
        System.out.println("Total Publication sell price:$"+total_price);            
        System.out.println("**************************************");
    }
    void total(double b) //total function to calculate total
    {
        bill=bill+b;
    }
}
class Books extends Publications{ //book class inherited from base class publication
    String author; 
    public void ordercopies(int qt) //ordercopies function to get order placed                               
    {
        System.out.println("Enter Title of Book:");
        title=sc.nextLine();
        System.out.println("Enter Name of the Author:");
        author=sc.nextLine();   
        setcopies(getcopies()+qt);
    } 
    void sellcopy(double price,int qt)//sellcopy function of books class to display sale of book                   
    {
        System.out.println("******Details Of the books********");
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Total copies of book:"+(copies));
        System.out.println("Total sell cost:$"+(copies*price));
        total(copies*price);
        System.out.println("**********************************");
    }
}
class Mag extends Publications{ //mag class inherited from base class publication
    int orderQty;
    String curr_issue;
    public void rec_new_issue(int orderQty) //function to get order details
    {
        System.out.println("Enter Title:");
        title=sc.nextLine();
        System.out.println("Enter New Issue:");
        String new_issue=sc.nextLine();
        setcopies(orderQty+getcopies());
        curr_issue=new_issue;
    }
    void sellcopy(double price,int orderQty) //sellcopy function to display sale of magazines                   
    {
        System.out.println("*******Details Of Magazines*******");
        System.out.println("Title:"+title);
        System.out.println("Issue:"+curr_issue);
        System.out.println("Total Magazine copies:"+orderQty);
        System.out.println("Total Magazine Sell:$"+(orderQty*price));
        total(orderQty*price);
        System.out.println("**********************************");
        
    }
}
public class Polymorphism_store {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        Books b=new Books();                                        
        Mag m=new Mag();                                  
        Publications p=new Publications();                        
        System.out.println("Enter copies of the Book:");
        int copies_book=sc.nextInt();
        System.out.println("Enter price of the Book:");
        double price_book=sc.nextDouble();
        b.ordercopies(copies_book);
        b.sellcopy(price_book,copies_book);
        System.out.println("Enter Copies of Magazine:");
        int copies_mag=sc.nextInt();
        System.out.println("Enter price of Magazine:");
        double price_mag=sc.nextDouble();
        m.rec_new_issue(copies_mag);
        m.sellcopy(price_mag,copies_mag);
        p.sellcopy(b.bill+m.bill,b.copies+m.copies);
            
    }
}