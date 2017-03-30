
// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter01 {
  public static void main(String[] args) {

    int n = 5;
    toCountDown(n);
  }

  public static int toCountDown(int i) {
    if (i == 0) {
      System.out.println(0);
      return 0;

    } else {
      System.out.println(i);

      return toCountDown(i - 1);
    }

  }
}
