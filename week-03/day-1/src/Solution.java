/**
 * Created by User on 2017. 03. 26..
 */
import java.util.Locale;
import java.util.Scanner;

  public class Solution {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in).useLocale(Locale.US);
      int i = scan.nextInt();

      double d = scan.nextDouble();

      String s = scan.nextLine();
      s = scan.nextLine();

      System.out.println("String: " + s);
      System.out.println("Double: " + d);
      System.out.println("Int: " + i);
    }
  }



