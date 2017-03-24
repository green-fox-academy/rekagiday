import java.util.Random;
import java.util.Scanner;

/**
 * Created by User on 2017. 03. 24..
 */
public class GuessMyNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please define two numbers i can choose between!");
    int minNumber = scanner.nextInt();
    int maxNumber = scanner.nextInt();

    Random r = new Random();
    int myNumber = r.nextInt(maxNumber-minNumber) + minNumber;

    System.out.println("Thanks! Now try to guess my number!");
    int yourNumber = scanner.nextInt();
    while (yourNumber != myNumber) {
      if (yourNumber > myNumber) {
        System.out.println("my number is lower, guess again");
      } else {
        System.out.println("my number is higher, guess again");
      }
      yourNumber = scanner.nextInt();
    }
    System.out.println("You found the number: " + myNumber);
  }
}

