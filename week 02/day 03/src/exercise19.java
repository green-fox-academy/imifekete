/**
 * Created by Fekete Imre on 2017.03.22..
 */

import java.util.Scanner;

public class exercise19 {
  public static void main(String[] args) {

    // Write a program that reads a number form the standard input,
    // If the number is zero or smaller it should print: Not enough
    // If the number is one it should print: One
    // If the number is two it should print: Two
    // If the number is more than two it should print: A lot

    Scanner myScanner = new Scanner(System.in);

    System.out.println("Give me a number: ");

    int n = myScanner.nextInt();

    if (n <= 0) {
      System.out.println("Not enough");
    } else if (n == 1) {
      System.out.println("One");
    } else if (n == 2) {
      System.out.println("Two");
    } else {
      System.out.println("A lot");
    }


  }
}
