import java.util.*;
class Employee

{
    String name;
    int year_of_joining;
    String address;
    
    Employee (String nm, int yr_of_joining, String add)
    
    {
       name=nm;
       year_of_joining=yr_of_joining;
       address=add;
        
    
    }
    
    void show()
   {
       System.out.print("  "+name+"    "+year_of_joining+"           "+ address);
    } 
    
}

public class emp_details {


    public static void main (String[] args) {
       
                int empl_num;
                 System.out.print("How many employees?: ");
                 Scanner empln= new Scanner(System.in);
                empl_num=empln.nextInt();
                
                Employee []ob = new Employee[empl_num];

                    for (int i=0;i<ob.length;i++){ //taking input values
                        
                String name;
                int year_of_joining;
                String address;
                Scanner sc= new Scanner(System.in);
               
                System.out.println("### Index of Employee:"+(i+1)+":----");
                System.out.print("Enter the employee name:");
                name=sc.next();
                System.out.print("Enter the year of joining:");
                year_of_joining=sc.nextInt();
                System.out.print("Enter the address of employee:");
                address=sc.next();
            ob[i]= new Employee (name,year_of_joining,address);         //creating obj for each array index for the costructor
         }
              System.out.println("\n\n Name  Year of joining  Address");

               for (int i=0;i<ob.length;i++){       //printing the taken input's value only
                ob[i].show();
                System.out.println();   
            }
    }
    }
