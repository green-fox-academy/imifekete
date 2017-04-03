import java.util.ArrayList;
import java.util.Arrays;

public class List01 {
  public static void main(String[] args) {

    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

    planetList.add(5, "Saturn");
    // Saturn is missing from the planetList
    // Insert it into the correct position

    System.out.println(planetList);
  }
}