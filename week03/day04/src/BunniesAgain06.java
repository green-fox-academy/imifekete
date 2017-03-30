
// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class BunniesAgain06 {
  public static void main(String[] args) {

    int bunnies = 100;
    System.out.println(toCountEars(bunnies));
  }

  public static int toCountEars(int i) {
    if (i == 0) {
      return 0;
    } else if (i % 2 == 1) {
      int nrOfEarsEven = 2;
      return nrOfEarsEven + toCountEars(i - 1);
    } else {
      int nrOfEarsOdd = 3;
      return nrOfEarsOdd + toCountEars(i - 1);
    }
  }
}
