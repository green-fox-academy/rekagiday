/**
 * Created by User on 2017. 03. 30..
 */
public class Counter {

  public static void main(String[] args) {

    counter(9);
  }

  public static int counter(int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.println(n);
      return counter(n - 1);
    }
  }
}
