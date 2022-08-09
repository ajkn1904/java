import java.util.*;
public class array
{
    public static void main(String[]args) {
        Scanner dif=new Scanner(System.in);
        System.out.println("Enter the range of the array: ");
        int range = dif.nextInt();
        int num[]= new int[range] ;    
        
        int i;

        System.out.println("Enter the values in the range: ");
            for(i=0;i<num.length;i++)
            {
                num[i]=dif.nextInt();
            }

            Arrays.sort(num); 
            int small= num[0];
            int large=num[num.length - 1];
        System.out.println("The smallest value is: "+small);
        System.out.println("The largest value is:"+large);

         int difference =large-small;

       System.out.println("Difference is: "+difference); 
    }
}