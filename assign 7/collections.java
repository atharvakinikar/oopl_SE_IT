/*
Name:- Atharva Kinikar
Div :- SE10
Batch :- F10
Roll no :- 23241
*/

import java.util.ArrayList; //importing arraylist package
import java.util.*;
import java.lang.*;
import java.io.*;

//class number_op to containing methods realted to number operations
class number_op {
    private int n, count, element, choice; // class variables

    number_op() { // class constructor
        n = 0;
        count = 0;
        element = 0;
        choice = 0;
    }

    void even_odd(int x) { // function to check if number is even or odd
        if (x % 2 == 0) {
            System.out.println(x + " is an even number.");
            count++;
        } else {
            System.out.println(x + " is  an odd number.");
        }
    }

    void prime(int x) { // function to check if number is prime or not
        boolean flag = false;
        if (x == 1)
            System.out.println(x + " is not prime number");
        else {
            for (int j = 2; j <= x / 2; j++) {
                if (x % 2 == 0) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println(x + " is not a prime number");
            }

            else {
                System.out.println(x + " is prime number");
                count++;
            }
        }

    }

    void check(int choice, int x) { // checking for odd& even numbers and prime numbers
        switch (choice) {
        case 1:
            even_odd(x);
            break;

        case 2:
            prime(x);
            break;

        default:
            System.out.println("Enter valid choice");
            break;
        }

    }

    void getdata() { // method to get data from user
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");
        n = sc.nextInt();
        System.out.println("enter the elements: ");
        for (int i = 0; i < n; i++) {
            element = sc.nextInt();
            nums.add(element);
        }

        do {
            System.out.println(
                    "Enter the operation to be performed on Arraylist of Numbers\n1.Count even & odd number\n2.Count prime numbers\n3.Exit");
            choice = sc.nextInt();
            for (int i : nums) {
                check(choice, i);
            }

            if (choice == 1) {
                System.out.println("Total even numbers => " + count);
                System.out.println("Total odd numbers => " + (n - count));
                count = 0;
            } else if (choice == 2) {
                System.out.println("Total prime numbers => " + count);
                System.out.println("Total non-prime numbers => " + (n - count));
                count = 0;
            }
        } while (choice != 3);

    }
}

// class string_op containing string operations
class string_op {
    // member variables
    private int n, count;
    private String str;

    string_op() { // class constructor
        n = 0;
        str = "";
        count = 0;
    }

    void check_palindrome(String x) { // function to check if string is palindrome
        StringBuilder s1 = new StringBuilder(x);
        if (x.equals(s1.reverse().toString())) {
            System.out.println(x + " is a Palindrome");
            count++;
        }

        else {
            System.out.println(x + " is not a Palindrome");
        }

        System.out.println("The number of Palindromes is: " + count);
    }

    void get_data() { // functio get string input from user
        ArrayList<String> words = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        n = sc.nextInt();
        System.out.println("enter the elements: ");
        for (int i = 0; i < n; i++) {
            str = sc.next();
            words.add(str);
        }

        for (String w : words) {
            check_palindrome(w);
        }
    }
}

public class collections { // public class collections
    public static void main(String[] args) { // main function
        int choice1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(
                    "Enter the type of list list you want to work on :-\n1.Arraylist of String\n2.Arraylist of Numbers\n3.Exit");
            choice1 = sc.nextInt();
            switch (choice1) {
            case 1:
                string_op obj1 = new string_op();
                obj1.get_data();
                break;

            case 2:
                number_op obj2 = new number_op();
                obj2.getdata();
                break;

            case 3:
                System.out.println("exiting the program");
                break;

            default:
                System.out.println("Enter valid choice");
                break;

            }

        } while (choice1 != 3);

    }
}