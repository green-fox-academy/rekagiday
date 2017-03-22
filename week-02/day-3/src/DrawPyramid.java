import java.util.Scanner;

/**
 * Created by User on 2017. 03. 22.
 */
public class DrawPyramid {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please type a number to indicate how big your pyramid should be");
      int lines = scanner.nextInt();

      for (int i = 1; i <= lines; i++) {
        String s = new String();
        for (int j = lines; j >= 1; j--) {
          if (j > i) {
            s += " ";
          } else if (j == i) {
            s += "*";
          } else {
            s += "**";
          }
        }
        System.out.println(s);
      }
    }
}
