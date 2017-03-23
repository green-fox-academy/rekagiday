import java.util.Scanner;

/**
 * Created by User on 2017. 03. 23..
 */
public class GuessTheNumber {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please guess a number");
    int yourNumber = scanner.nextInt();

    int myNumber = 264;

    while (yourNumber != myNumber) {
      if (yourNumber > myNumber) {
        System.out.println("Stored number is lower, guess again");
      } else {
        System.out.println("Stored number is higher, guess again");
      }
      yourNumber = scanner.nextInt();
    }
    System.out.println("You found the number: " + myNumber);
  }
}

