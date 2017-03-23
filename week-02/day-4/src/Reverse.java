
/**
 * Created by User on 2017. 03. 23..
 */
public class Reverse {

  public static void main(String[] args) {

    String text =".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    text = new StringBuilder(text).reverse().toString();

    System.out.println(text);
  }
}