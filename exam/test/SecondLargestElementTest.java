import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class SecondLargestElementTest {


  @Test
  public void getSecondLargest() throws Exception {

    SecondLargestElement secondLargestElement = new SecondLargestElement();
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(7);
    list.add(5);
    list.add(6);
    list.add(4);

    assertEquals(6,secondLargestElement.getSecondLargest(list) );
  }

  @Test
  public void notGetSecondLargestElement()throws Exception{

    SecondLargestElement secondLargestElement = new SecondLargestElement();
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(7);
    list.add(5);
    list.add(6);
    list.add(4);

    assertNotEquals(2, secondLargestElement.getSecondLargest(list));
  }
}