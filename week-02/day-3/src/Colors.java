import java.util.Arrays;

/**
 * Created by User on 2017. 03. 22..
 */
public class Colors {
  public static void main(String[] args) {

    String[][] color = {
        {"lime", "forest green", "olive", "pale green", "spring green"},
        {"orange red", "red", "tomato"},
        {"orchid", "violet", "pink", "hot pink"}
    };

    System.out.println(Arrays.toString(color[0]));
    System.out.println(Arrays.toString(color[1]));
    System.out.println(Arrays.toString(color[2]));
  }
}
