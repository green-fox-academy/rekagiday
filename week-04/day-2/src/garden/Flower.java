package garden;

/**
 * Created by User on 2017. 04. 04..
 */
public class Flower extends Plant {

  public Flower(String color) {
    this.color = color;
    this.waterState = 0;
    this.waterAbsorption = 0.75;
    this.needsWater = 5;
  }

  public void useWater(int waterAmount) {
    waterState += (waterAmount * 0.75);
  }




}

