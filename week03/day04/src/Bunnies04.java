
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies04 {
  public static void main(String[] args) {
    int bunnies = 15;
    System.out.println(toCountBunnyEars(bunnies));
  }

  public static int toCountBunnyEars(int i) {
    if (i == 0) {
      return 0;
    } else {
      int nrOfEars = 2;
      return i*nrOfEars;
    }
  }
}
