/**
 * Created by User on 2017. 04. 10..
 */
public class Character extends GameObject {

  double hp, dp, sp;
  int level;
  int d6;

  public Character() {
    this.level = 1;
  }

  public Character(String filename, int posX, int posY) {
    super(filename, posX, posY);
    this.level = 1;
    d6 = (int) (Math.random() * 6);
  }

  public int getLevel() {
    return level;
  }

  public void moveUp() {
    this.posY -= tileSize;
  }

  public void moveDown() {
    this.posY += tileSize;
  }

  public void moveLeft() {
    this.posX -= tileSize;
  }

  public void moveRight() {
    this.posX += tileSize;
  }
}
