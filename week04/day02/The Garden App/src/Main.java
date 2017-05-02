/**
 * Created by Fekete Imre on 2017.04.04..
 */
public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.addPlant(new Flower("yellwo"));
    garden.addPlant(new Flower("blue"));
    garden.addPlant(new Tree("purple"));
    garden.addPlant(new Tree("orange"));

    garden.checkForWaterNeeded();
    System.out.println();
    garden.waterGarden(40);
    garden.checkForWaterNeeded();
    System.out.println();
    garden.waterGarden(70);
    System.out.println();
  }
}

