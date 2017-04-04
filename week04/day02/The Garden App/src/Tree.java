/**
 * Created by Fekete Imre on 2017.04.04..
 */
public class Tree extends Plant {
  public Tree (String color){
    super (color, 10);
  }

  @Override
  public void waterPlant (int water){
    setCurrentWaterAmount(water * .4);
  }
}
