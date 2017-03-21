/**
 * Created by User on 2017. 03. 21..
 */
import java.util.Scanner;

// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one

public class CountFromTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me 2 numbers");
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    if (b <= a) {
      System.out.println("The second number should be bigger!");
    }

    else {
      for (int i=a; i<=b; i++) {
        System.out.println(i);
      }
    }




  }
}
