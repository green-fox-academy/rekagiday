package reka.greenfox;

/**
 * Created by User on 2017. 04. 03..
 */
public class Station {
  static int gasAmount;

  public void refill() {
    this.gasAmount = gasAmount - Car.capacity;
    Car.gasAmount+= Car.capacity;
  }


}
