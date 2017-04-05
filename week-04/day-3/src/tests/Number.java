package tests;

import java.util.ArrayList;

/**
 * Created by User on 2017. 04. 05..
 */
public class Number {


  public int sum(ArrayList<Integer> numbers){

    int total = 0;

    for (int i = 0; i < numbers.size(); i++) {
      total += numbers.get(i);
    }
    return total;
  }

}
