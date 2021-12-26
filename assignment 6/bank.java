import java.util.Scanner;
;public class bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int acc[]=new int[8];
            System.out.println("Enter the account number :");
            String s=sc.nextLine();
            for(int i=0;i<s.length();i++)
            {
                acc[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            System.out.println("Account number is valid!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Account number. Please Enter account number again.");
        }
    }
}
