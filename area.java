import java.util.Scanner;
class setDim
{
    double length;
    double breadth;

setDim(double l,double b)
    {
        length=l;
        breadth=b;    }
void getArea()
{ 
    System.out.println("The length of the rectangular is: "+length);
    System.out.println("The breadth of the rectangular is: "+breadth);
    double area;
    area=(length*breadth);
    System.out.println("Area of the rectangular is: "+area);

}}
public class area
{
  public static void main(String[] args) {

     double length, breadth;
     Scanner cb= new Scanner(System.in);
     //cb.close();
     System.out.println("Enter the value of length: ");
     length=cb.nextDouble();
     System.out.println("Enter the value of breadth: ");
     breadth=cb.nextDouble();
    
     setDim ob= new setDim(length,breadth);
     ob.getArea();
     
  } 
}