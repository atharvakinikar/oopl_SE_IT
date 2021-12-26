import java.util.Scanner;
class login{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try{
        String user_id=null,pass;
        System.out.println("Enter user ID=>");
        user_id=sc.nextLine();
        if(user_id.length()==0)user_id=null;
        System.out.println("Enter Password=>");
        pass=sc.nextLine();
        if(pass.length()==0)pass=null;
        System.out.println(user_id.length());
        System.out.println(pass.length());
        System.out.println("Login Successfull");
    }
    catch(NullPointerException e){
        System.out.println("Field Cannot be empty!!!");
        System.out.println("Please give credentials again");
    }
    }
}