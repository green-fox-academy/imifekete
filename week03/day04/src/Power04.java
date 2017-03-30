
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power04 {
  public static void main(String[] args) {
    System.out.println(toThePowerOf(3, 2));
  }
  public static int toThePowerOf(int base, int toPower) {
    if (toPower == 1) {
      return base;
    }
    else {
      return base * toThePowerOf(base, toPower - 1);
    }
  }

}