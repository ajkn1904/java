//constructor overloading
//Calling unknown/default constructor,and constructor with perameter

import java.util.Scanner;
//import java.lang.*;
class Stdnt
 {
    String name;

//Constructor with perameter
Stdnt(String nm)
{
    name=nm;

}

//Blank/Default Costructor
Stdnt()
{
    name="Unknown";     //String inside "..."   //Veriable declatration
}

void show()
{
    System.out.println("Student Name is: "+ name);
}

}
public class costructor_overloading
{
public static void main(String[] args) {

    String name;

//Default Costructor
//No need to scan input, scanning default
System.out.println("Student Name is: ");    //Printing default/Unknown  
Stdnt ob= new Stdnt();                     // Creating default object
ob.show();                                // Showing default object

//Defined Constructor with perameter
Scanner sc1= new Scanner(System.in);        //Scanning user definded input
sc1.close();                                //Closing sc1 statement(optional)
System.out.println("Student Name is: ");    //Printing user definded name
name=sc1.next();                            //Taking string input
Stdnt ob1= new Stdnt(name);                 //Creating user defined object
 ob1.show();                                //Showing user defined object

}

}