/**
 * Created by Fekete Imre on 2017.03.22..
 */

    import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it

    System.out.println("Think and pls type any amount of km and I will convert it into miles");
    Scanner myScanner = new Scanner(System.in);
    int kilometers = myScanner.nextInt();
    System.out.println("So " + kilometers + "km is " + (kilometers * 0.621) + " miles.");

  }
}
