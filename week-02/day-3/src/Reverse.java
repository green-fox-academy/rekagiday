import java.util.Arrays;

/**
 * Created by User on 2017. 03. 22..
 */
public class Reverse {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};
    int placeholder = aj[0];

    aj[0] = aj[4];
    aj[4] = placeholder;
    placeholder = aj[1];
    aj[1] = aj[3];
    aj[3] = placeholder;
    System.out.println(Arrays.toString(aj));
  }
}
