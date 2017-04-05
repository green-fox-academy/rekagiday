package tests;

import java.util.ArrayList;
import java.util.List;

public class SumTest {

  private int sum(ArrayList<Integer> numbers){
    int sum = 0;

    for (int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i);
    }
     return sum;
  }

}
