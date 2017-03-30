/**
 * Created by User on 2017. 03. 30..
 */
public class NumberAdder {

  public static void main(String[] args) {
    System.out.println(add(10));
  }

  private static int add(int n) {
    if (n == 0) {
      return 0;
    }
    else {
      int result = n + add(n - 1);
      System.out.println(n);
      return result;
    }


  }
}
