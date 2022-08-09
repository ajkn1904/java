import java.util.Scanner;
class CuC 
{
    double side;

    CuC(double x){
    side=x;
    }
   CuC getObject()
{
    CuC object = new CuC(side);
    return object;
}
void show()
{
    System.out.println("The side of cuebe  is: "+side);
    System.out.println("The are of the cube is: "+6*(side*side));
}
}
public class practice_1{
    public static void main(String[] args)
    {
    Scanner cub= new Scanner(System.in);
    double side;
    System.out.print("\n\n\nEnter the value of side of the cube: ");
    side = cub.nextDouble();

    CuC ob = new CuC(side);
    ob.show();
    
    CuC ob1;
        ob1=ob.getObject();
        ob1.show();
    }
}