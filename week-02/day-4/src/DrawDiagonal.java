import java.util.Scanner;

/**
 * Created by User on 2017. 03. 23..
 */
public class DrawDiagonal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a number to indicate how big your square should be");
    int size = scanner.nextInt();

    for (int i = 1; i <= size; i++) {
      if (i == 1 || i == size) {
        for (int j = 0; j < size; j++) {
          System.out.print("%");
        }
      } else {
        for( int j = 1; j <= size; j++) {
          if (j == 1 || j == size || j == i) {
            System.out.print("%");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
