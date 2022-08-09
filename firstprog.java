import java.util.Scanner;
//import java.lang.*;
class Student
 {
    String name;
    int student_id;     //instance variable because there is no 'static' word
    double gpa;

Student(String nm, int std_id, double std_gpa)    //constructor 
{                     //constructor means initialising 
    name=nm;
    student_id=std_id;
    gpa=std_gpa;

}                     //no return type like void
void show()       //instance method because it is inside a class
{
    System.out.println("Student Name is: "+ name);
    System.out.println("Student Id is: "+ student_id);
    System.out.println("Student GPA is: "+ gpa);
}

}
public class firstprog
{
  public static void main(String[] args) {

//fixed input
      /*Student ob= new Student("Anika", 1904, 4.00);
      Student ob1= new Student("Salma", 1911, 4.00);
      Student ob2= new Student("Hrittik", 1929, 4.00);
      Student ob3= new Student("Riya", 1930, 4.00);*/
      //
      //ob1.show();
      //ob2.show();
      //ob3.show();

    //user define input
     /* String name;
      int student_id;
      double gpa;
    Scanner sc= new Scanner(System.in);
    System.out.println("Student Name is: ");
name=sc.next();
    System.out.println("Student ID is: ");
student_id=sc.nextInt();
    System.out.println("Student Name is: ");
     gpa=sc.nextDouble();
     Student ob= new Student(name,student_id,gpa);
     ob.show();*/

    //multiple data collection
     int std_num;
      Scanner stdn=new Scanner(System.in);
      stdn.close();                                //Closing stdn statement(optional)
      System.out.print("How many students?");
      std_num=stdn.nextInt();

      Student [] ob = new Student[std_num];     //array
      for(int i=0;i<std_num;i++)
      {
        String name;
      int student_id;
      double gpa;
    Scanner sc= new Scanner(System.in);
    sc.close();                                //Closing sc statement(optional)
    System.out.println("###Information of Student: "+(i+1)+"###");
    System.out.println("Student Name is: ");
name=sc.next();
    System.out.println("Student ID is: ");
student_id=sc.nextInt();
    System.out.println("Student Name is: ");
     gpa=sc.nextDouble();
     ob[i]= new Student(name,student_id,gpa);
     ob[i].show();}

  } 

}
