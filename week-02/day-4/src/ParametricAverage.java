import java.util.Scanner;

/**
 * Created by User on 2017. 03. 23..
 */
public class ParametricAverage {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("please let me know how many numbers you wold like to sum/average: ");

    int numberCount = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < numberCount; i++) {
      System.out.println("please enter a number:");
      sum += scanner.nextInt();
    }
    System.out.println(
        "your sum is: " + sum + ", your average is: " + (double) sum / (double) numberCount);
  }
}
