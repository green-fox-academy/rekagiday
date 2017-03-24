import java.util.Scanner;

/**
 * Created by User on 2017. 03. 23..
 */
public class Anagram {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me two words and I can tell if they are anagram");
    String firstWord = scanner.nextLine();
    String secondWord = scanner.nextLine();

    if (firstWord.length() != secondWord.length()) {
      System.out.println(false);
    } else {
      for (int i = 0; i < firstWord.length(); i++) {
        if (secondWord.indexOf(firstWord.charAt(i)) == -1) {
          System.out.println(false);
          return;
        }
      }
      System.out.println(true);
    }
  }
}
