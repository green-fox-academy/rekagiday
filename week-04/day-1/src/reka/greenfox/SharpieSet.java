package reka.greenfox;

import java.util.ArrayList;

/**
 * Created by User on 2017. 04. 03..
 */
public class SharpieSet {

  ArrayList<Sharpie> sharpieSet;

  public SharpieSet() {
    sharpieSet = new ArrayList<>();
  }

  public void add(Sharpie sharpie) {
    sharpieSet.add(sharpie);
  }

  int countUsable() {
    int usable = 0;
    for (Sharpie sharpie : sharpieSet) {
      if (sharpie.isUsable()) {
        usable++;
      }
    }
    return usable;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpieSet.size();) {
      if (!sharpieSet.get(i).isUsable()) {
        sharpieSet.remove(i);
      } else {
        i++;
      }
    }
  }

  public static void main(String[] args) {
    Sharpie yellow = new Sharpie("yellow", 0.5f);
    Sharpie green = new Sharpie("green", 0.8f);
    System.out.println(yellow.color);
    yellow.use();
    green.use();
    green.use();

  }
}

