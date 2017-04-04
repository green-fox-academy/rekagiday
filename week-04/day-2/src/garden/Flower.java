package garden;

/**
 * Created by User on 2017. 04. 04..
 */
public class Flower {

  String color;
  int waterState;

  public Flower(String color) {
    this.color = color;
    this.waterState = 0;
    System.out.println("A flower is created");
  }

  public void useWater(int waterAmount) {
    waterState += (waterAmount * 0.75);
  }

  public boolean needsWater() {
    if (waterState < 5) {
      return true;
    } else {
      return false;
    }
  }
}

