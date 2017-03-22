/**
 * Created by Fekete Imre on 2017.03.22..
 */
public class Swap {
  public static void main(String[] args) {
    int a = 123;
    int b = 526;
    int c;

    c = a;
    a = b;
    b = c;

    System.out.println(a);
    System.out.println(b);
  }
}
