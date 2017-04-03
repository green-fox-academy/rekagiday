package reka.greenfox;

/**
 * Created by User on 2017. 04. 03..
 */
public class Counter {

  int a = 0;
  int initialValue;

  public Counter() {
  }

  public Counter(int a){
    this.a = a;
    initialValue = a;
  }

  public void add(int b){
    this.a = a + b;
  }

  public void add() {
    this.a++;
  }

  public int get() {
    return a;
  }

  public void reset() {
    this.a = initialValue;
  }
}
