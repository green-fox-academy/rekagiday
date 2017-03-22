/**
 * Created by User on 2017. 03. 22..
 */
public class Printer {
  public static void printer(String[] text ) {
    for (String currentLine : text) {
      System.out.print(currentLine);
    }
  }

  public static void main(String[] args) {
    String[] text = {"snkfnk ", "wrnefklns ", "kbfs"};

    printer(text);
  }
}
