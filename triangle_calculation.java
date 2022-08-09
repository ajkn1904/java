import java.util.Scanner;
class Triangle
{
    
    int base;
    int height;

Triangle(int b, int h)

    {
        base=b;
        height=h;
    }

void area()
{
    
    System.out.println("Base: "+base);
    System.out.println("Height: "+height);
    double area;
    area=0.5*(base*height);
    System.out.println("Area: "+area);

}}
public class triangle_calculation
{
  public static void main(String[] args) {

    
     int base,height;
     Scanner tr= new Scanner(System.in);
    tr.close();                                //Closing tr statement(optional)
     System.out.println("Base: ");
     base=tr.nextInt();
     System.out.println("Height: ");
     height=tr.nextInt();
    
     Triangle ob= new Triangle(base,height);
     ob.area();
  } 

}
