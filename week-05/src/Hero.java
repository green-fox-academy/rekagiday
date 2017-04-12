import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.lang.*;

/**
 * Created by User on 2017. 04. 10..
 */
public class Hero extends Character {

  int moveCount;

  public Hero(int posX, int posY) {
    super("assets/hero-down.png", posX, posY);
    this.hp = 20 + 3 * d6;
    this.dp = 2 * d6;
    this. sp = 5+ d6;
    moveCount = 0;
  }


  public void moveUp() {
    this.posY -= tileSize;
    setImage("assets/hero-up.png");
    moveCount++;
  }

  public void moveDown() {
    this.posY += tileSize;
    setImage("assets/hero-down.png");
    moveCount++;
  }

  public void moveLeft() {
    this.posX -= tileSize;
    setImage("assets/hero-left.png");
    moveCount++;
  }

  public void moveRight() {
    this.posX += tileSize;
    setImage("assets/hero-Right.png");
    moveCount++;
  }
}
