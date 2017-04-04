/**
 * Created by Fekete Imre on 2017.04.04..
 */
public class Plant {
  private boolean needWater;
  private double currentWaterAmount;
  private String color;
  private int needWaterWhen;

  public Plant(String color, int needWaterWhen){
    this.currentWaterAmount = 0;
    this.color = color;
    this.needWaterWhen =needWaterWhen;
  }

  public void waterPlant(int water){
    currentWaterAmount += water;
  }

  public double getCurrentWaterAmount(){
    return this.currentWaterAmount;
  }

  public void setCurrentWaterAmount(double waterAmount){
    currentWaterAmount +=waterAmount;
  }

  public int getNeedWaterWhen(){
    return needWaterWhen;
  }

  public String getColor(){
    return this.color;
  }

}
