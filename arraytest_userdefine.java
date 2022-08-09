import java.util.*;
public class arraytest_userdefine
{
    public static void main(String[]args) {
        Scanner dif=new Scanner(System.in);      //object creating for user define input
        dif.close();
        System.out.println("Enter the range of the array: ");
        int range = dif.nextInt();          //taking 'input' on range from user through the object
        int num[]= new int[range] ;         //taking user define array
        
        int i;          //i is for loop

        System.out.println("Enter the values in the range: ");
            for(i=0;i<num.length;i++)       //num.length is defining 'the range of the array' or 'array size'
            {
                num[i]=dif.nextInt();       //taking input values from user through the object
            }

            Arrays.sort(num);       //sorting the values of
            int small= num[0];
            int large=num[num.length - 1];

//Because the 1st element is the smallest and the last one is the largest.
// So the Small one is in the (total range - 1)th position. #Oposite.

        System.out.println("The smallest value is: "+small);
        System.out.println("The largest value is:"+large);

         int difference =large-small;

       System.out.println("Difference Between The largest & Sallest Value in an array is: "+difference); 
    }
}