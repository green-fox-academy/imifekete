/**
 * Created by Fekete Imre on 2017.03.22..
 */
public class CodingHours {
  public static void main(String[] args) {

    int hoursSpentCoding = 17 * 5 * 6;

        System.out.println("hours spent coding: " + hoursSpentCoding);

    int percentageCodingPerSemester = hoursSpentCoding * 100 / (17 * 52);

       System.out.println("the percentage of the coding hours in the semester: " + percentageCodingPerSemester);
  }
}
