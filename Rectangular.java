import java.util.Scanner;

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

public class Rectangular {

  public static void main(String[] args) {
    double length, breadth;
    Scanner rc = new Scanner(System.in);

    System.out.println("Enter the value of length: ");
    length = rc.nextDouble();
    System.out.println("Enter the value of breadth: ");
    breadth = rc.nextDouble();

    Area ob = new Area();
    ob.setDim(length, breadth);

    System.out.println("The length of the rectangular is: " + length);
    System.out.println("The breadth of the rectangular is: " + breadth);
    System.out.println("Area of the rectangular is: " + ob.getArea());
  }
}
