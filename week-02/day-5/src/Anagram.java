import java.util.Scanner;

/**
 * Created by User on 2017. 03. 23..
 */
public class Anagram {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me two words and I can tell if they are anagram");

    String firstWord = scanner.nextLine();
    firstWord = firstWord.toLowerCase();
    for (int i = 0; i < firstWord.length(); i++) {
      for (int j = i; j < firstWord.length(); j++) {
        if (firstWord.charAt(i) > firstWord.charAt(j)) {
          firstWord = firstWord.substring(0, i)
              + firstWord.charAt(j)
              + firstWord.substring(i + 1, j)
              + firstWord.charAt(i)
              + firstWord.substring(j + 1, firstWord.length());
        }
      }
    }
    String secondWord = scanner.nextLine();
    for (int i = 0; i < secondWord.length(); i++) {
      for (int j = i; j < secondWord.length(); j++) {
        if (secondWord.charAt(i) > secondWord.charAt(j)) {
          secondWord = secondWord.substring(0, i)
              + secondWord.charAt(j)
              + secondWord.substring(i + 1, j)
              + secondWord.charAt(i)
              + secondWord.substring(j + 1, secondWord.length());
        }
      }
    }

    if (firstWord.length() != secondWord.length()) {
      System.out.println(false);
    } else if (firstWord.equals(secondWord)) {
      System.out.println(true);
      return;
    } else {
      System.out.println(false);
    }
  }
}
