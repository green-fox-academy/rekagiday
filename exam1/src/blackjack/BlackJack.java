package blackjack;

/**
 * Created by User on 2017. 04. 18..
 */
public class BlackJack {

  public static void main(String[] args) {
    Deck deck = new Deck(12);
    System.out.println(deck.getDeck());
    Card drawn = deck.draw();
    System.out.println(drawn.getCard());
    System.out.println(deck.getDeck());
  }
}

