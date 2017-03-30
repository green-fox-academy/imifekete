/**
 * Created by Fekete Imre on 2017.03.22..
 */

import java.util.Scanner;

public class Summing {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Type a number to sum until: ");
    int numGiven = myScanner.nextInt();

    System.out.println("The sum is: " + sum(numGiven));
  }

  public static int sum(int sumTill) {
    int sum = 0;

    for (int i = 0; i < sumTill + 1; i++) {
      sum += i;
    }

    return sum;
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter