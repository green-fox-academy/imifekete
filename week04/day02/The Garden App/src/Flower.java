/**
 * Created by Fekete Imre on 2017.04.04..
 */
public class Flower extends Plant {
  public Flower (String color){
    super (color, 5);
  }

  @Override
  public void waterPlant (int water){
    setCurrentWaterAmount(water * .75);
  }
}
