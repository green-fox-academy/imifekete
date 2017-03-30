/**
 * Created by Fekete Imre on 2017.03.22..
 */
public class cuboid {
  public static void main(String[] args) {
      double x = 7.00;
      double y = 11.00;
      double z = 12.00;

      int surfaceArea = (int) (x * y * 2 + z * x * 2 + z * y * 2);
      int volume = (int) (y * x * z);
      System.out.println("Surface Area: " + surfaceArea);
      System.out.println("Volume: " + volume);
  }
}
