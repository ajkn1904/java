//import java.util.*;
//import java.lang.Math;
abstract class Shape{
    double length;
    double breadth;
    double side;
    double radius;

Shape(double l, double b, double s,double r)
    {
        length=l;
        breadth=b;
        side= s;
        radius=r;
    }
abstract void RectangularArea( double breadth, double length);
abstract void SquareArea( double side);
abstract void CircleArea(double radius);
}
class Areaa extends Shape{
    double Area;
Areaa(double l, double b, double s, double r)
   {
     super(l,b,s,r);
    }
    void RectangularArea(double length, double breadth){
        Area=length*breadth;
        System.out.println("Area of the rectangular is: "+Area);
    }
    void SquareArea(double side){
        Area=side*side;
        System.out.println("Area of the rectangular is: "+Area);
    }
    void CircleArea(double radius){
        Area=(3.14 * Math.pow(radius,2));
        System.out.println("Area of the rectangular is: "+Area);
    }
}

public class method_overriding {
    public static void main(String [] args){

    Areaa ar= new Areaa(3,9,5,2);
    ar.RectangularArea(3,9);
    ar.SquareArea(5);
    ar.CircleArea(2);
    }    
}
