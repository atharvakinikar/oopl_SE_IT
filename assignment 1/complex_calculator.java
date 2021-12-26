/*
Name:- Atharva Kinikar
Roll.No :- 23241
Div:- SE10
Batch:- F10
*/

import java.util.Scanner;//importing scanner package 
class Complex{
    float real,imag;
    public Complex()//default constructor for setting values
    {
        real=0;
        imag=0;
    }

    public Complex(float val1,float val2)//parameterised constructor for setting values
    {
        real=val1;
        imag=val2;
    }

    public void display(Complex c1,Complex c2)//display function to output the entered numbers
    {
        System.out.println("First number is : ("+c1.real+")+("+c1.imag+")i");//printing first number
        System.out.println("Second number is : ("+c2.real+")+("+c2.imag+")i");//printing second number
    }
    
    public void addition(Complex c1,Complex c2)//function for adding two Complex numbers
    {
        float real1,imag1;
        real1=(c1.real+c2.real);//adding real parts of numbers
        imag1=(c1.imag+c2.imag);//adding imaginary parts of number
        display(c1, c2);//printing the input numbers given by user
        System.out.println("Addition is : ("+real1+")+("+imag1+")i");//prinitng the addition of two numbers
        System.out.println("***************************************");
    }

    public void subtraction(Complex c1,Complex c2)//function for subtracting two Complex numbers
    {
        float real1,imag1;
        real1=(c1.real-c2.real);//subtracting real parts of numbers
        imag1=(c1.imag-c2.imag);//subtracting imaginary parts of number
        display(c1, c2);//printing the input numbers given by user
        System.out.println("Subtraction is : ("+real1+")+("+imag1+")i");//printing subtraction of two numbers
        System.out.println("***************************************");
    }

    public void multiply(Complex c1,Complex c2)//function for multiplying two Complex numbers
    {
        float real1,imag1;
        real1=(c1.real*c2.real-c1.imag*c2.imag);//real part of multiplication
        imag1=(c1.real*c2.imag+c1.imag*c2.real);//'imaginary part of multiplication
        display(c1, c2);//printing the input numbers given by user
        System.out.println("Multiplication is : ("+real1+")+("+imag1+")i");//printing multiplication of two numbers
        System.out.println("***************************************");
    }

    public void division(Complex c1,Complex c2)
    {
        float num1,num2,denom,div1,div2;
        num1=(c1.real*c2.real+c1.imag*c2.imag);//real part of numerator
        num2=(c1.imag*c2.real-c1.real*c2.imag);//imaginary part of numerator
        denom=(c2.real*c2.real + c2.imag*c2.imag);//denominator part of division
        div1=num1/denom;//real part of division
        div2=num2/denom;//imaginary part of division
        display(c1, c2);//printing the input numbers given by user
        System.out.println("Division is : ("+div1+")+("+div2+")i");//printing division of two numbers
        System.out.println("***************************************");
    }

}

public class complex_calculator{
    public static void main(String[] args) {
        int choice;//choice variable for selecting operation
        float num1,num2;//variables for real part and imaginary part of numbers
        Complex cal = new Complex();//memory allocated to object
        Scanner sc=new Scanner(System.in);//scanner object created
        System.out.println("Enter the real & imaginary part of first number respectively:");//accepting first number from user
        num1=sc.nextInt();//input real part of first number
        num2=sc.nextInt();//input imaginary part of first number
        Complex obj1=new Complex(num1,num2);//passing the first number to parameterised constructor
        System.out.println("Enter the real & imaginary part of second number respectively:");//acccepting second number from user
        num1=sc.nextInt();//input real part of second number
        num2=sc.nextInt();//input imaginary part of second number
        Complex obj2=new Complex(num1,num2);////passing the second number to parameterised constructor

        do
        {
        System.out.println("Enter the choice : \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");//accepting operation to be performed from user
        choice=sc.nextInt();//input choice number
        switch(choice)//using switch statement for carrying out operation
        {
            case 1:
            cal.addition(obj1,obj2);//calling the addition function to add given two Complex numbers
            break;

            case 2:
            cal.subtraction(obj1,obj2);//calling the subtraction function to subtract given two Complex numbers
            break;

            case 3:
            cal.multiply(obj1,obj2);//calling the multiplication function to multiply given two Complex numbers
            break;

            case 4:
            cal.division(obj1,obj2);//calling the division function to divide given two Complex numbers
            break;

            case 5:
            System.out.println("Exited the program");//exiting the program
            break;

            default:
            System.out.println("Invalid choice!");//invalid choice by user
            break;

        }
        

        }while(choice!=5);

    }
}
