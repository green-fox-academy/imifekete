
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder02 {
  public static void main(String[] args) {
    int n = 10;
    System.out.println(toAddNumbers(n));
  }

  public static int toAddNumbers(int i) {
    if (i == 1) {
      return 1;
    } else {
      return i + toAddNumbers(i - 1);
    }
  }
}
