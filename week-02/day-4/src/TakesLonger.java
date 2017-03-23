/**
 * Created by User on 2017. 03. 23..
 */
public class TakesLonger {

  public static void main(String[] args) {

    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    int index = quote.indexOf("y");

    String fixedQuote = quote.substring(0, index) + ("always takes longer than ") + quote.substring(index);

    System.out.println(fixedQuote);
  }
  }


