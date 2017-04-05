package tests;
import java.util.HashMap;

public class LetterCounter {

  public HashMap<Character, Integer> letterCounter(String string) {

    HashMap<Character, Integer> letterList;
    letterList = new HashMap<>();

    for (int i = 0; i < string.length(); i++) {
      int counter = 0;
      char currentLetter = string.charAt(i);
      if (!letterList.containsKey(string.charAt(i))) {
        letterList.put(string.charAt(i), 1);
      }
      for (int j = 0; j < string.length(); j++) {
        if (string.charAt(j) == currentLetter) {
          counter++;
        }
      }
    }
    return letterList;
  }
}

