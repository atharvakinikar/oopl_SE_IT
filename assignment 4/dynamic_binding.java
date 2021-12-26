import java.util.*; //importing java scanner class
abstract class shape{ //abstract class shape
    double num1,num2; //variables of type float
    shape(){ //using constructor to set values
        num1=0;
        num2=0;
    }
    abstract public void compute_area(); //abstract function to compute area
}

class rectangle extends shape{ //class rectangle inherited from class shape
    rectangle(){ //constructor to scan and set values
        super();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle =>");
        num1=sc.nextDouble();
        System.out.println("Enter the breadth of rectangle =>");
        num2=sc.nextDouble();
    }
    public void compute_area(){ //defining the abstract function compute area from parent class
        double area=num1*num2; //calculating area
        System.out.println("The area of rectangle is =>"+area);
        System.out.println("*********************");
    }
}

class triangle extends shape{ //class triangle inherited from class shape
 
    triangle(){ //constructor to scan and set values
        super();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of triangle =>");
        num1=sc.nextDouble();
        System.out.println("Enter the height of triangle =>");
        num2=sc.nextDouble();
    }

    public void compute_area(){ //defining the abstract function compute area from parent class
        double area=num1*num2*0.5; //calculating area
        System.out.println("The area of triangle is => "+area);
        System.out.println("*********************");
    }
}


public class dynamic_binding { 
    public static void main(String[] args) { //main function
        
        
        System.out.println("*********************");
        
        
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the operation to be performed\n1.Compute area of rectangle\n2.Compute area of triangle\n3.Exit");
            choice=sc.nextInt(); //accepting required operation to be performed from user
            switch(choice){
                case 1:
                System.out.println("*********************");
                shape rect=new rectangle();
                rect.compute_area();
                break;

                case 2:
                System.out.println("*********************");
                shape tri=new triangle();
                tri.compute_area();
                break;

                case 3:
                System.out.println("*********************");
                System.out.println("Exiting the program");
                break;

                default:
                System.out.println("*********************");
                System.out.println("Enter valid choice");
            }
        }while(choice!=3);
    }
}
