package oddaverage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 18..
 */
public class OddAvg {

  List<Integer> numbers;

  public int oddAverage(List<Integer> numbers) {
    this.numbers = numbers;
    List<Integer> oddNumbers = new ArrayList<>();
    int average;
    int total = 0;

    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 1) {
        oddNumbers.add(numbers.get(i));
      }
    }

    for (int i = 0; i < oddNumbers.size(); i++) {
      total += oddNumbers.get(i);
    }
    average = total / oddNumbers.size();
    return average;
  }
}


