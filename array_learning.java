import java.util.Scanner;

class Employe {

  String name;
  String address;
  int year_of_joining;
  double salary;

  Employe(String nm, String add, int joining_yr, double slry) {
    name = nm;
    address = add;
    year_of_joining = joining_yr;
    salary = slry;
  }

  void show() {
    System.out.println("Name is: " + name);
    System.out.println("Address is: " + address);
    System.out.println("Year of joining is: " + year_of_joining);
    System.out.println("Salary is: " + salary);
  }
}

public class array_learning {

  public static void main(String[] args) {
    int empl_num;
    Scanner emp = new Scanner(System.in);
    //emp.close();                                //Closing emp statement(optional)

    System.out.print("How many employees?");
    empl_num = emp.nextInt();

    Employe[] ob = new Employe[empl_num]; //array
    for (int i = 0; i < empl_num; i++) {
      String name;
      String address;
      int year_of_joining;
      double salary;
      Scanner em = new Scanner(System.in);
      //em.close();                                //Closing em statement(optional)
      System.out.println("Information of Employee: " + (i + 1));
      System.out.println("Name is: ");
      name = em.next();
      System.out.println("Address is: ");
      address = em.next();
      System.out.println("Year of joining is: ");
      year_of_joining = em.nextInt();
      System.out.println("Salary is: ");
      salary = em.nextDouble();
      ob[i] = new Employe(name, address, year_of_joining, salary);
      ob[i].show();
    }
  }
}
