
// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class Sumdigit03 {
  public static void main(String[] args) {
    System.out.println(digitSumer(123456789));
  }
  public static int digitSumer(int digitsToAdd) {
    if (digitsToAdd < 10) {
      return digitsToAdd;
    }
    else {
      return (digitsToAdd % 10) + (digitSumer(digitsToAdd / 10));
    }
    }

  }
