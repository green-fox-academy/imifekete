
public class Card {
  String color;
  String value;

  public Card(String value, String color) {
    this.value = value;
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString(){
    return value + "" + color +"s";
  }
}
