/**
 * Created by Fekete Imre on 2017.03.22..
 */

import java.util.Scanner;

public class exercise20 {

  public static void main(String[] args) {

// Write a program that asks for two numbers and prints the bigger one
    Scanner myScanner = new Scanner(System.in);
    System.out.println("first number: ");
    int a = myScanner.nextInt();
    System.out.println("second  number: ");
    int b = myScanner.nextInt();

    if (a > b) {
      System.out.println(a + " is bigger.");
    } else {
      System.out.println(b + " is bigger.");
    }
  }
}
