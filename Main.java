//package Vehicle;
import java.util.*;

class Vehicle {

  String make;
  String color;
  int year;
  String model;

  public Vehicle(String m, String c, String mo, int y) {
    make = m;
    color = c;
    model = mo;
    year = y;
  }

  void printDetails() {
    System.out.println(
      "\n\nSpecification of the vehicle is: " +
      make +
      ", " +
      color +
      ", " +
      year +
      ", " +
      model
    );
    // System.out.print("BodyStyle of the Car is: "+bodyStyle);

  }
}

class Car extends Vehicle {

  private String bodyStyle;

  public Car(String m, String c, String mo, int y, String bs) {
    super(m, c, mo, y);
    bodyStyle = bs;
  }

  void carDetails() {
    System.out.print("\n\nBodyStyle of the Car is: " + bodyStyle);
  }
}

public class Main {

  public static void main(String[] args) {
    Scanner vh = new Scanner(System.in);
    System.out.print("Enter the name of the thing the vehicle is made of: ");
    String make = vh.next();
    System.out.print("Enter the color of the vehicle: ");
    String color = vh.next();
    System.out.print("Enter the model of the vehicle: ");
    String model = vh.next();
    System.out.print("Enter the year: ");
    int year = vh.nextInt();

    Scanner bds = new Scanner(System.in);

    //   Car cr=new Car(bodyStyle);
    System.out.print("Enter the bodyStyle of the Car: ");
    String bodyStyle = bds.next();

    Vehicle vhc = new Vehicle(make, color, model, year);
    Car cr = new Car(make, color, model, year, bodyStyle);
    cr.carDetails();
    cr.printDetails();
  }
}
