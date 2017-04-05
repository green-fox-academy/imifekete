/**
 * Created by Fekete Imre on 2017.04.05..
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class AppleTest {
  Apple a = new Apple("alma");


  @Test
  public void getApple() throws Exception {
    assertEquals("alma", a.getApple());

  }

}

