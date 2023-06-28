import java.util.Scanner;

public class chocolate {

  public int makeChocolate(int small, int big, int goal) {
    int r;
    r = (goal - big * 5);
    if (r > small) return -1; else if (r < small) return r; else if (
      r == small
    ) return r; else return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("makeChocolate: ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    chocolate ob = new chocolate();
    int ans = ob.makeChocolate(x, y, z);
    System.out.println("Output: " + ans);
  }
}
