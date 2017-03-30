/**
 * Created by User on 2017. 03. 30..
 */
public class Fibonacci {

  public static void main(String[] args) {
    System.out.println(fibonacci(8));
  }

  private static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}
