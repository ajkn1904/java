/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication9;
//import java.lang.*;
import java.util.Scanner;
/**
 *
 * @author rukun
 */

class Employ

{
    String name;
    int year_of_joining;
    double salary;
    String address;
    
    Employ (String nm, int yr_of_joining, double sal, String add)
    
    {
       name=nm;
       year_of_joining=yr_of_joining;
       salary=sal;
       address=add;
        
    
    }
    
    void show()
    {
        System.out.println("Employee Name is: "+ name);
        System.out.println("Joining year is: "+ year_of_joining);
	    System.out.println("Salary is: "+ salary ); 
        System.out.println("Address is: "+ address );  
        
    }
    
    
    
}


public class helpabc {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        // To do code application logic here
                int empl_num;
                Scanner empln= new Scanner(System.in);
                empln.close();
                System.out.print("How many employees?");
                empl_num=empln.nextInt();
                
                Employ [] ob = new Employ[empl_num];
                for (int i=0;i<empl_num;i++)
                {
                String name;
                int year_of_joining;
                double salary;
                String address;
                Scanner sc= new Scanner(System.in);
                sc.close();
                System.out.println("###Information of Employee:"+(i+1)+"###");
                System.out.print("Enter the employee name:");
                name=sc.next();
                System.out.print("Enter the year of joining:");
                year_of_joining=sc.nextInt();
                System.out.print("Enter the salary of employee:");
                salary=sc.nextDouble();
                System.out.print("Enter the address of employee:");
                address=sc.next();
                ob[i]= new Employ (name,year_of_joining,salary,address ); 
                ob[i].show();   
                }
                
		//Student ob1= new Employee ("Zafar", 8767, 3.67);
		
		/*System.out.println("Student Name is: "+ob.name);
		System.out.println("Student ID is: "+ob.student_id);
		System.out.println("Student GPA is: "+ob.gpa);*/
		
		
		
		
        
        
    }
    
}