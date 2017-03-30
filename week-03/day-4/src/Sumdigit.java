/**
 * Created by User on 2017. 03. 30..
 */
public class Sumdigit {

  public static void main(String[] args) {
    System.out.println(sumdigit(1111));
  }

  private static int sumdigit(int n) {
    if (n < 10) {
      return n;
    } else {
      return n % 10 + sumdigit(n/10);
    }
  }
}
