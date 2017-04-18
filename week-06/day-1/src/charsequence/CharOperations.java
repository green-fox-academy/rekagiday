package charsequence;

/**
 * Created by User on 2017. 04. 18..
 */
public class CharOperations implements CharSequence {

  String text;

  CharOperations(String text) {
    this.text = text;
  }

  @Override
  public int length() {
    return text.length();
  }

  @Override
  public char charAt(int index) {
    return text.charAt(text.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String backwardsText = "";
    for (int i = end; i > start - 1; i--) {
      backwardsText += (text.substring(i, i + 1));
    }
    return backwardsText;
  }

  public static void main(String[] args) {
    CharOperations c = new CharOperations("Almafa");
    System.out.println(c.subSequence(2, 4));
    System.out.println(c.charAt(2));
  }
}

