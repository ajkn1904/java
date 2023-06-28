//import java.util.Scanner;
import java.util.*;

class Area {

  double length;
  double breadth;

  void setDim(double l, double b) {
    length = l;
    breadth = b;
  }

  double getArea() {
    return length * breadth;
  }
}

public class firstpro {

  public static void main(String[] args) {
    double length;
    double breadth;
    Scanner rc = new Scanner(System.in);
    System.out.println("Enter the value of length: ");
    length = rc.nextDouble();
    System.out.println("Enter the value of breadth: ");
    breadth = rc.nextDouble();

    Area ob = new Area();
    ob.setDim(length, breadth);
    System.out.println("Area of the Rectangular is: " + ob.getArea());
  }
}
