import java.util.*;
interface AdvancedArithmatic{
int divisorSum();
default void show()
    {
        System.out.println("This is a default method's output");
    }
}
class MyCalculator implements AdvancedArithmatic{
    public int divisorSum()
    {
    int sum=0;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0)
            sum=sum+i;
           // System.out.println("The devisors of the number is: "+(n/i));
        }  
        return sum;
    }
}

public class intrfc{ 
public static void main(String[] args) {
    //int n;
    AdvancedArithmatic ob = new MyCalculator();
    System.out.println("Sum of all devisors of the number is: "+ob.divisorSum());
     ob.show();
}
}