/**
 * Created by User on 2017. 03. 30..
 */
public class String2 {

  public static void main(String[] args) {
    System.out.println(StringCutter("This is the next text."));
  }

  private static String StringCutter(String yourText) {
    if (yourText.length() < 1) {
      return yourText;
    } else {
        String prefix = yourText.startsWith("x") ? "" : yourText.substring(0, 1);
        return prefix + StringCutter(yourText.substring(1));
    }
  }
}

