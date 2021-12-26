
/*
Name :- Atharva Kinikar
Div :- SE10
Batch :- F10
Roll NO :- 23241
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // creating object sc of Scanner class
        try {
            System.out.println("Enter number of elements of array =>");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements in an array");
            for (int i = 0; i < n; i++) // entering elements in an array
            {
                System.out.print("Enter " + (i) + " index Element: ");
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the array index to display element present on that position:");
            int i = sc.nextInt();
            System.out.println("Element Present:" + arr[i]);
            System.out.println();
            System.out.println("Enter two numbers for Division"); // Entering numbers for division
            System.out.println("Enter Num 1:");
            int n1 = Integer.parseInt(sc.next());
            System.out.println("Enter Num 2:");
            int n2 = Integer.parseInt(sc.next());
            ;
            int a = n1 / n2;
            System.out.println("Division of " + n1 + " and " + n2 + " is:" + a);
        } catch (NumberFormatException e) // Exception is thrown when numbers are not enteres
        {
            System.out.println("NumberFormatException Occured!!!");
        } catch (ArithmeticException e) // Division by 0 Exception thrown
        {
            System.out.println("Division by Zero not possible!!!");
        } catch (ArrayIndexOutOfBoundsException e) // Array index out of bound exception thrown
        {
            System.out.println("Array Index Out Of Bound!!!");
        }
        sc.close();
    }
}