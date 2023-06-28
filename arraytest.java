//import java.util.*;
public class arraytest {

  public static void main(String[] args) {
    int num[] = { 7, 9, 12, 5, 2 };
    int large = num[0];
    int small = num[0];
    int i, dif;

    for (i = 0; i < num.length; i++) {
      if (num[i] > large) large = num[i]; else if (num[i] < small) small =
        num[i];
    }
    System.out.println("The largest value is:" + large);
    System.out.println("The smallest value is: " + small);
    dif = large - small;
    System.out.println(
      "Difference Between The largest & Smallest Value in an array is: " + dif
    );
  }
}
