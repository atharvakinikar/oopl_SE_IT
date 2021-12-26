
import java.util.*;
public class Exceptionhandling6
{
            @SuppressWarnings("resource")
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
   int T = 3;
   do {

	   int num1,num2;
    float div,rem;
    try
 {
    System.out.println("\nEnter the value of first integer : ");
    num1=Integer.parseInt(sc.next());
    System.out.println("\nEnter the value of second integer: ");
     num2=Integer.parseInt(sc.next());
     div=num1/num2;
     rem = num1%num2;
     System.out.println("\nQuotient is : "+div);
     System.out.println("\nRemainder is : "+rem);

  }
 catch(NumberFormatException e){
	  System.out.println("Invalid Integer input");
      System.out.println(e);
  }
  catch(ArithmeticException e){
	  System.out.println("Division by zero is not possible");
	  System.out.println(e);
 }
T--;
	   
 }while(T!=0);
  
   
   System.out.println("For aaray index out of bound exception:");
   
   int arr[] = new int[5];
   T = 3;
   System.out.println("Enter the 5 elemenst of the array");
   for(int i =0;i<5;i++)
   {
	   arr[i] = sc.nextInt();
   }
   
   System.out.println("Elements in the array are:: ");
   for(int i =0;i<5;i++)
   {
	   System.out.println( arr[i] );
   }

  
   do {
 	  System.out.println("Enter the index of the required element ::");
       try {
          int element = sc.nextInt();
          System.out.println("Element in the given index is :: "+arr[element]);
       } catch(ArrayIndexOutOfBoundsException e) {
     	  System.out.println("Catch Block");
          System.out.println("The index you have entered is invalid");
          System.out.println("Please enter an index number between 0 and 4");
       }
 	  T--;
   } while(T!=0);
    	  
}
}