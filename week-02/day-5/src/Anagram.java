/**
 * Created by User on 2017. 03. 23..
 */
public class Anagram {

  public static void main(String[] args) {
    String firstWord = "car";
    String secondWord = "arc";

    if (firstWord.length() != secondWord.length()) {
      System.out.println(false);
    } else {
      for (int i = 0; i < firstWord.length(); i++) {
        // !secondWord.contains('r') = secondWord.indexOf('r') != -1
        if (secondWord.indexOf(firstWord.charAt(i)) == -1) {
          System.out.println(false);
          return;
        }
      }
      System.out.println(true);
    }
  }
}
