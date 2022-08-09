//import java.util.InputMismatchException;
import java.util.*;
public class excptnhndln {
    public static void main(String[]args) {
        int x=0;
        int y=0;
        int c=0;
        // Random r = new Random();
        Scanner r= new Scanner(System.in);
        try{
          
            System.out.print("\nInput x: ");
            x = r.nextInt();
            System.out.print("\nInput y: ");
            y = r.nextInt();
            c=(x/y);
            System.out.println("\n\n " +c);
        
        }
        catch(ArithmeticException e){
            System.out.print("\nValue is undefined: " +e);
        }
        catch(InputMismatchException f){
            System.out.print(" \nCheck your input: " +f);
        }
        finally{
            System.out.println("\nOutput from finally block.\n\n");
        }
    }
    
}
