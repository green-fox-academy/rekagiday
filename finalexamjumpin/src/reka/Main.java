package reka;

import java.util.ArrayList;
import java.util.List;

public class Main {


  private static List<Integer> letterCounter(String text, char charToFind) {

    List<Integer> indexes = new ArrayList<>();

    for (int i = 0; i < text.length(); i++) {

      if (text.charAt(i) == charToFind) {
        indexes.add(i);
      }
    }
    return indexes;
  }

  public static void main(String[] args) {

    System.out.println(letterCounter("almafa", 'a'));

  }
}
