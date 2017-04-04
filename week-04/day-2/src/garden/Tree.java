package garden;

/**
 * Created by User on 2017. 04. 04..
 */
public class Tree {

  String color;
  int waterState;

  public Tree(String color) {
    this.color = color;
    this.waterState = 0;
    System.out.println("A tree is created");
  }

  public void useWater(int waterAmount) {
    waterState += (waterAmount*0.4);
  }

  public boolean needsWater() {
    if (waterState < 10){
      return true;
    } else {
      return false;
    }
  }
}
