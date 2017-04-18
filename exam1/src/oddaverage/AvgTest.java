package oddaverage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Created by User on 2017. 04. 18..
 */
public class AvgTest {

  OddAvg oddAvg = new OddAvg();

  List<Integer> myList = new ArrayList<>();

  @Test
  void testAverage() {
    myList.add(1);
    myList.add(3);
    myList.add(5);
    myList.add(6);
    assertEquals(3, oddAvg.oddAverage(myList));
  }


  @Test
  void testAverage2() {
    myList.add(2);
    myList.add(2);
    myList.add(3);
    myList.add(2);
    assertEquals(3, oddAvg.oddAverage(myList));
  }


  @Test
  void testAverage3() {
    myList.add(2);
    myList.add(4);
    myList.add(6);
    assertEquals(0, oddAvg.oddAverage(myList));
  }
}

