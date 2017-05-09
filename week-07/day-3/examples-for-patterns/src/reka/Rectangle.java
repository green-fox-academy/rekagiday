package reka;

/**
 * Created by User on 2017. 05. 07..
 */
public class Rectangle implements Shape {


  RectangleLegacy oldRectangle;

  public Rectangle(RectangleLegacy oldRectangle) {
    this.oldRectangle = oldRectangle;
  }

  @Override
  public void display(int x1, int y1, int x2, int y2) {
    oldRectangle.display(x1, y1, x2, y2);
  }
}

