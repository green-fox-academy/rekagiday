/**
 * Created by User on 2017. 03. 22..
 */
public class Sum {
  public static void sum(int a) {
    int total = 0;
    for (int i = 1; i < a + 1; i++) {
      total = total + i;
    }
    System.out.println(total);
  }

  public static void main(String[] args) {
    sum(5);

  }
}
