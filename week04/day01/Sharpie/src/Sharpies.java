/**
 * Created by Fekete Imre on 2017.04.03..
 */
public class Sharpies {
  public static void main(String[] args) {

    Sharpie sharpie1 = new Sharpie("blue", 10);
    Sharpie sharpie2 = new Sharpie("green", 13);


    sharpie1.use();
    sharpie2.use();

    System.out.println(sharpie1.color + sharpie1.width + sharpie1.inkAmount);
    System.out.println(sharpie2.color + sharpie2.width + sharpie2.inkAmount);
  }
}
