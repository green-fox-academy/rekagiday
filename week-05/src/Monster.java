import java.lang.*;

/**
 * Created by User on 2017. 04. 10..
 */
public class Monster extends Character {

  Hero hero;

  public Monster(String filename, int posX, int posY) {
    super("assets/skeleton.png", posX, posY);
    posX = (int) (Math.random() * 10 + 2);
    posY = (int) (Math.random() * 10 + 2);
    this.hp = 2 * level * d6;
    this.dp = level / 2 * d6;
    this.sp = level * d6;
  }

  public void moveUp() {
    if (hero.moveCount % 2 == 0)
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
