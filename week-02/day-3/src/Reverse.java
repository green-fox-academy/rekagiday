import java.util.Arrays;

/**
 * Created by User on 2017. 03. 22..
 */
public class Reverse {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7, 8, 9, 10, 11};

    for (int i = 0; i < aj.length / 2; i++) {
      int last = aj.length - i -1;
      int placeholder = aj[i];
      aj[i] = aj[last];
      aj[last] = placeholder;
    }
    System.out.println(Arrays.toString(aj));
  }
}
