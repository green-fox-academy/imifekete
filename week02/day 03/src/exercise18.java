/**
 * Created by Fekete Imre on 2017.03.22..
 */
 import java.util.Scanner;

public class exercise18 {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input,
// Than prints "Odd" if the number is odd, or "Even" if it is even.

    Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int n = myScanner.nextInt();
        if(n % 2 == 0) {
            System.out.println("Even");
          }
        else {
            System.out.println("Odd");
          }



  }
}
