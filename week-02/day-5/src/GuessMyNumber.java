import java.util.Random;
import java.util.Scanner;

/**
 * Created by User on 2017. 03. 24..
 */
public class GuessMyNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please define two numbers I can choose between!");
    int minNumber = scanner.nextInt();
    int maxNumber = scanner.nextInt();

    Random r = new Random();
    int myNumber = r.nextInt(maxNumber - minNumber) + minNumber;

    System.out.println("Thanks! Now try to guess my number! You have 6 lives.");
    int yourNumber = scanner.nextInt();
    int lives = 5;

    while (yourNumber != myNumber) {
      if (lives == 0) {
        System.out.println("You died.");
        return;
      } else if (yourNumber > myNumber) {
        System.out.println("My number is lower. Lives remaining : " + (lives));
        lives--;
      } else {
        System.out.println("My number is higher. Lives remaining : " + (lives));
        lives--;
      }
      yourNumber = scanner.nextInt();
    }
    System.out.println("You found the number: " + myNumber);
  }
}

