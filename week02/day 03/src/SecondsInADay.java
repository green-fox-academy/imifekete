/**
 * Created by Fekete Imre on 2017.03.22..
 */
public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 12;
    int currentMinutes = 27;
    int currentSeconds = 42;
    int secondsInADay = 24 * 60 * 60;
    int secondsTillCalculation = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;

    System.out.println("Remaining seconds: " + (secondsInADay - secondsTillCalculation));
  }
}
