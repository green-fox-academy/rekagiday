/**
 * Created by User on 2017. 04. 19..
 */
public class SplitString {

  String input;
  int index;

  public String[] splitString(String input, int index) {

    String string1;
    String string2;

    try {
      string1 = input.substring(0, index - 1);
      string2 = input.substring(index, input.length() - 1);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("index out of bound");
    }
    String[] twoString = {string1, string2};
    return twoString;
  }
}
