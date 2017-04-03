package reka.greenfox;

/**
 * Created by User on 2017. 04. 03..
 */
public class Animal {

  int hunger;
  int thirst;

  public Animal() {
    hunger = 50;
    thirst = 50;
  }

  public void eat() {
    hunger--;
  }

  public void drink(){
    thirst--;
  }

  public void play(){
    hunger++;
    thirst--;
  }
}
