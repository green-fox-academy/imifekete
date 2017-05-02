import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAverage {
  public static void main(String[] args) {
    List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7);
    System.out.println(getOddAverage(numberList));
  }

  public static int getOddAverage(List<Integer> listOfNumbers) {
    List<Integer> oddNumberList = new ArrayList<>();
    int sumOfOddNumbers = 0;
    for (int i : listOfNumbers) {
      if (i % 2 == 1) {
        oddNumberList.add(i);
      }
    }
    for (int i : oddNumberList) {
      sumOfOddNumbers = sumOfOddNumbers + i;
    }

      return sumOfOddNumbers / oddNumberList.size();
  }
}