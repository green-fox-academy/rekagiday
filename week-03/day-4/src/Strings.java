import static jdk.nashorn.internal.objects.NativeString.replace;

/**
 * Created by User on 2017. 03. 30..
 */
public class Strings {

  public static void main(String[] args) {
    System.out.println(StringSwitcher("This is the next text.", 'x', 'y'));
  }

  private static String StringSwitcher(String yourText, char from, char to) {
    if (yourText.length() < 1) {
      return yourText;
    } else {
      char letter = from;
      if (letter == yourText.charAt(0)) {
        letter = to;
      } else {
        letter = yourText.charAt(0);
      }
      return letter + StringSwitcher(yourText.substring(1), from, to);
    }
  }
}

