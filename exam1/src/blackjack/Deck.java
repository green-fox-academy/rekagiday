package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 2017. 04. 18..
 */
public class Deck {

  List<Card> deck;

  public Deck(int number) {

    for (int i = 0; i < number; i++) {
      Card card = new Card();
      int colorRng = (int) (Math.random() * 4);
      int valueRng = (int) (Math.random() * 7);
      if (colorRng == 0) {
        card.setColor("spades");
      } else if (colorRng == 1) {
        card.setColor("hearts");
      } else if (colorRng == 2) {
        card.setColor("diamonds");
      } else if (colorRng == 3) {
        card.setColor("clubs");
      }
      if (valueRng == 0) {
        card.setValue("7");
      }
      if (valueRng == 1) {
        card.setValue("8");
      }
      if (valueRng == 2) {
        card.setValue("9");
      }
      if (valueRng == 3) {
        card.setValue("10");
      }
      if (valueRng == 4) {
        card.setValue("Jack");
      }
      if (valueRng == 5) {
        card.setValue("Queen");
      }
      if (valueRng == 6) {
        card.setValue("King");
      }
      deck.add(i, card);
    }
  }

  List<Card> shuffle() {
    List<Card> shuffledDeck = new ArrayList<>();
    Collections.shuffle(deck);
    deck = shuffledDeck;
    return deck;
  }

  Card draw() {
    Card drawn = deck.get(0);
    deck.remove(deck.get(0));
    return drawn;
  }
}
