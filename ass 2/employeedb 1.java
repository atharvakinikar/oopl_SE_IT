/*
Name:- Atharva Kinikar
Div: SE10
Batch : F10
Roll. no :- 23241
*/

import java.util.Scanner; //importing Scanner class
class emp{ //declaring employee class
    private int emp_id; //declaring variable  emp_id
    public String emp_name,emp_type;//declaring variable  emp_name and emp_type
    private String email_id;//declaring variable email_id
    private String address;//declaring variable address
    private String contact;//declaring variable contact

    emp() //employee class constructor
    {
        //initialising variables of class
        emp_id=00;
        email_id="example@gmail.com";
        emp_name="noname";
    }


    void display_details(String type) //display function to display details of employee
    {
        String temp=type;
        System.out.println("*************Details of employee*************");
        System.out.println("Employee ID:"+emp_id);
        System.out.println("Employee Type:"+temp);
        System.out.println("Employee Name:"+emp_name);
        System.out.println("Employee Contact:"+contact);
        System.out.println("Employee Email-ID:"+email_id);
        System.out.println("Employee Address:"+address);
    }
    
    int validity(emp e1[],int j) //function to check validity of employee id
    {
        int id;
        Scanner sc1=new Scanner(System.in);
        int check;
        do{
            check=1;
            System.out.print("Enter the employee ID => ");
            id=sc1.nextInt();
            for(int k=0;k<j;k++){
                if(e1[k].emp_id==id)
                {
                    System.out.println("Duplicate Employee ID is not allowed");
                    check=0;
                    break;
                }
            }
        }while(check==0);

        return id;
    }

    void getdata(emp obj1,int j,emp e1[]) //function to get data of employee
    {
        System.out.println("*******************************************");
        Scanner sc=new Scanner(System.in);
        emp_id=validity(e1, j);
        System.out.print("Enter the name of employee=>");
        emp_name=sc.nextLine();
        System.out.print("Enter the email-id of employee=>");
        email_id=sc.nextLine();
        boolean check=false;
        do{
            System.out.print("Enter a valid 10 digit mobile number : ");
            contact=sc.nextLine();
            if(contact.length()==10)
            {
                check=true;
            }
            else
            {
                System.out.println("Invalid mobile number");
            }

        }while(check!=true);
        System.out.print("Enter the address of employee=>");
        address=sc.nextLine();
    }
}

class programmer extends emp{ //programmer class
        double basic;
        programmer(emp e1[],int j) //parameterisaed constructor of class programmer
        {
            super();//using super keyword to call constructor
            super.getdata(e1[j], j,e1);
            double basic;
            emp_type="PROGRAMMER";
            System.out.print("Enter the basic pay of programmer => ");
            Scanner sc=new Scanner(System.in);
            basic=sc.nextDouble();
            super.display_details(emp_type);//calling display function 
            calculate(basic);//calling calculate function
        }

        void calculate(double basic){ //calculate function to calculate and display salary details
            double tax,da,hra,pf,net,gross;
            da=basic*0.5;
            hra=basic*0.1;
            pf=basic*0.12;
            tax=basic*0.15;
            gross=basic+da+hra;
            net=gross-pf-tax;
    
            System.out.println("****************Salary details of Employee************");
            System.out.println("Basic pay => "+basic);
            System.out.println("DA => "+da);
            System.out.println("HRA => "+hra);
            System.out.println("PF => "+pf);
            System.out.println("Taxes => "+tax);
            System.out.println("Gross Salary => "+gross);
            System.out.println("Net salary => "+net);
            System.out.println("*******************************************");
        }
    }

class team_lead extends emp{

        double basic;
        team_lead(emp e1[],int j) //parameterisaed constructor of class team_lead
        {
            super();//using super keyword to call constructor
            super.getdata(e1[j], j,e1);
            double basic;
            emp_type="TEAM LEAD";
            System.out.print("Enter the basic pay of team leader => ");
            Scanner sc=new Scanner(System.in);
            basic=sc.nextDouble();
            super.display_details(emp_type);//calling display function 
            calculate(basic);//calling calculate function
        }

        void calculate(double basic){
            double tax,da,hra,pf,net,gross;
            da=basic*0.5;
            hra=basic*0.1;
            pf=basic*0.12;
            tax=basic*0.15;
            gross=basic+da+hra;
            net=gross-pf-tax;
    
            System.out.println("****************Salary details of Employee************");
            System.out.println("Basic pay => "+basic);
            System.out.println("DA => "+da);
            System.out.println("HRA => "+hra);
            System.out.println("PF => "+pf);
            System.out.println("Taxes => "+tax);
            System.out.println("Gross Salary => "+gross);
            System.out.println("Net salary => "+net);
            System.out.println("*******************************************");
        }
}

class assistant_proj_manager extends emp{
    double basic;
    assistant_proj_manager(emp e1[],int j)//parameterisaed constructor of class assistant_team_lead
    {
        super();
        super.getdata(e1[j], j,e1);
        double basic;
        emp_type="ASSISTANT PROJECT MANAGER";
        System.out.print("Enter the basic pay of Assistant project manager => ");
        Scanner sc=new Scanner(System.in);
        basic=sc.nextDouble();
        super.display_details(emp_type);//calling display function 
        calculate(basic);//calling calculate function
    }

    void calculate(double basic){
        double tax,da,hra,pf,net,gross;
        da=basic*0.5;
        hra=basic*0.1;
        pf=basic*0.12;
        tax=basic*0.15;
        gross=basic+da+hra;
        net=gross-pf-tax;

        System.out.println("****************Salary details of Employee************");
        System.out.println("Basic pay => "+basic);
        System.out.println("DA => "+da);
        System.out.println("HRA => "+hra);
        System.out.println("PF => "+pf);
        System.out.println("Taxes => "+tax);
        System.out.println("Gross Salary => "+gross);
        System.out.println("Net salary => "+net);
        System.out.println("*******************************************");
    }
}

class proj_manager extends emp{
    double basic;
    proj_manager(emp e1[],int j)//parameterisaed constructor of class assistant_team_lead
    {
        super();
        super.getdata(e1[j], j,e1);
        double basic;
        emp_type="PROJECT MANAGER";
        System.out.print("Enter the basic pay of project manager => ");
        Scanner sc=new Scanner(System.in);
        basic=sc.nextDouble();
        super.display_details(emp_type);//calling display function 
        calculate(basic);//calling calculate function
    }

    void calculate(double basic){
        double tax,da,hra,pf,net,gross;
        da=basic*0.5;
        hra=basic*0.1;
        pf=basic*0.12;
        tax=basic*0.15;
        gross=basic+da+hra;
        net=gross-pf-tax;

        System.out.println("****************Salary details of Employee************");
        System.out.println("Basic pay => "+basic);
        System.out.println("DA => "+da);
        System.out.println("HRA => "+hra);
        System.out.println("PF => "+pf);
        System.out.println("Taxes => "+tax);
        System.out.println("Gross Salary => "+gross);
        System.out.println("Net salary => "+net);
        System.out.println("*******************************************");
    }
}

public class employeedb {
    public static void main(String[] args) { //main function
        Scanner sc=new Scanner(System.in);
        emp obj=new emp();
        System.out.println("Enter maximum number of employees=>");
        int n=sc.nextInt(); //taking input for maximum employees
        int choice;
        emp e1[]=new emp[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Select the type of employee :\n1.Programmer\n2.Team Lead\n3.Assistant Project Manager\n4.Project Manager\n5.Exit\n");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                programmer obj1=new programmer(e1,i);
                

                case 2:
                team_lead obj2=new team_lead(e1,i);
                

                case 3:
                assistant_proj_manager obj3=new assistant_proj_manager(e1,i);
                

                case 4:
                proj_manager obj4=new proj_manager(e1,i);
                
                case 5:
                System.out.println("Exiting");
                default:
                System.out.println("Enter valid choice");
                
            }
            
        }

        
    }
}
