import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fekete Imre on 2017.04.05..
 */
public class Sum {
  List<Integer> listOfIntegers = new ArrayList<>();

  public Sum (List<Integer> listOfIntegers){
    if(listOfIntegers != null){
      this.listOfIntegers = listOfIntegers;
    }
  }

  public void addIntElements (Integer x){
    listOfIntegers.add(x);
  }

  public int addNumbers() {
    int sum = 0;
    for (int i : listOfIntegers) {
      sum += i;
    }
    return  sum;
  }
}
