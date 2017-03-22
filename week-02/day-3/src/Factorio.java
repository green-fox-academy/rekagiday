/**
 * Created by User on 2017. 03. 22..
 */
public class Factorio {
  public static void factorio(int a) {
    int fact = 1;
    for (int i = 1; i < a + 1; i++) {
      fact *= i;
    }
    System.out.println(fact);

  }
  public static void main(String[] args) {
    factorio(6);
  }
}
