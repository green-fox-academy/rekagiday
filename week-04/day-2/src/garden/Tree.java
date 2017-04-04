package garden;

/**
 * Created by User on 2017. 04. 04..
 */
public class Tree extends Plant {


  public Tree(String color) {
    this.color = color;
    this.waterState = 0;
    this.waterAbsorption = 0.4;
    this.needsWater = 10;
  }

  public String getType() {
    return "tree";
  }
}

