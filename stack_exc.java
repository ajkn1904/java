import java.util.Scanner;
class Stack
{
    int top;
    String st[];

    Stack(int size)
{
    if(size<10){
        size=10;
        st=new String[size];
        top=-1;}
    else
        st=new String[size];
        top=-1;
}

void push(String item){
    if(top==st.length-1)
    System.out.print("Stack full.");
    else
    st[++top]=item;
   
}
String pop()
{
    if(top<0){

        return null;
        // System.exit(0);
    }
    else
        return st[top--];
    
}
}

public class stack_exc {
    public static void main (String[] args) {
       
                int size;
                 System.out.print("\n\nNumber of element is: ");
                 Scanner st= new Scanner(System.in);
                size=st.nextInt();

                Stack ob = new Stack(size);
                 for (int i=0;i<size;i++)
                 {
                     System.out.println("Stack push: ");
                     String stc=st.next();
                    ob.push(stc);
                 
                }

                System.out.println("\n\nStack after pop: ");
                 for (int i=0;i<size;i++)
                {if(i<4)
                    ob.pop();
                    else
                 System.out.println(ob.pop());
                }
    }
    }