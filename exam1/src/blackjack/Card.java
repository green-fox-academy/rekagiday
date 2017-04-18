package blackjack;

/**
 * Created by User on 2017. 04. 18..
 */
public class Card {

  String color;
  String value;

  public Card(String color, String value) {
    this.color = color;
    this.value = value;
  }

  public Card() {
  }

  public String getCard() {
    return value + " " + color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
