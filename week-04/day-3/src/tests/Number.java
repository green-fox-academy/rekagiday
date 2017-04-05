package tests;

import java.util.ArrayList;

public class Number {

  int sum(ArrayList<Integer> numbers) {

    int total = 0;

    if (numbers == null) {
      return 0;
    } else {
      for (int i = 0; i < numbers.size(); i++) {
        total += numbers.get(i);
      }
      return total;
    }
  }
}

