import java.util.Scanner;

/**
 * Created by User on 2017. 03. 21..
 */
public class DrawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a number to indicate how big your triangle should be");
    int lines = scanner.nextInt();

    for (int i = 0; i < lines; i++) {
      for (int j = i; j < lines; j++) {
        System.out.println("*");
      }
      System.out.println("*");
    }
  }
}
