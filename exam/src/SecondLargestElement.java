import java.util.ArrayList;

public class SecondLargestElement {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(7);
    list.add(5);
    list.add(6);
    list.add(4);

    System.out.println(getSecondLargest(list));
  }

  private static int getSecondLargest(ArrayList<Integer> list) {

    int secondLargest = list.get(0);
    int largest = list.get(0);

    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) > largest) {
        secondLargest = largest;
        largest = list.get(i);
      }
      if (list.get(i) > secondLargest && list.get(i) != largest) {
        secondLargest = list.get(i);
      }
    }
    System.out.print("Second largest element in the list is: ");
    return secondLargest;
  }
}
