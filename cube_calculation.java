import java.util.Scanner;

class Cube {

  double side;

  Cube(double a) {
    side = a;
  }

  Cube getObject() {
    Cube object = new Cube(side);
    return object;
  }

  void area() {
    System.out.println("The side of the Cube is: " + side);
    double area;
    area = 6 * (side * side);
    System.out.println("Area is: " + area);
  }
}

public class cube_calculation {

  public static void main(String[] args) {
    double side;
    Scanner cb = new Scanner(System.in);
    //cb.close();
    System.out.println("\n\n\nEnter the value of side: ");
    side = cb.nextDouble();

    Cube ob = new Cube(side);
    Cube ob1;
    ob1 = ob.getObject();
    ob.area();
    ob1.area();
  }
}
