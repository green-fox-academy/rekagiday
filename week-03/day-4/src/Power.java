/**
 * Created by User on 2017. 03. 30..
 */
public class Power {

  public static void main(String[] args) {
    System.out.println(power(3,3));

  }

  private static int power(int base, int n) {
    if (base == 1 ) {
      return 1;
    } else if (n ==1) {
      return base;
    }
    else {
      return base * (power(base, n-1));
    }
  }
}
