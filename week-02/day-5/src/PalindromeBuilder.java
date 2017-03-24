import java.util.Scanner;

/**
 * Created by User on 2017. 03. 24..
 */
public class PalindromeBuilder {

  public static void main(String[] args) {
    palindrome("add");
  }

  private static void palindrome(String text) {
    System.out.println("please enter a text you want to turn into a palindrome!");
    Scanner scanner = new Scanner(System.in);
    String original = scanner.nextLine();
    String palindromeSecondpart =new StringBuilder(original).reverse().toString();
    original = original.concat(palindromeSecondpart);
    System.out.println("here's your palindrome: " + original);
    return;

  }

}
