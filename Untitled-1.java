class Student
 {
    String name;
    int student_id;
    double gpa;

Student(String nm, int std_id, double std_gpa)
{
    name=nm;
    student_id=std_id;
    gpa=std_gpa;

}
void show()
{
    System.out.println("Student Name is: "+ name);
    System.out.print("Student Id is: "+ student_id);
    System.out.println("Student GPA is: "+ gpa);
}
}
public class main
{
  public static void main(String[] args) {
      Student ob= new Student("Anika", 1904, 4.00);
    
      ob.show();
      
  }  
}
