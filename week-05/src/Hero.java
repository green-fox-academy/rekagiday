import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.lang.*;

/**
 * Created by User on 2017. 04. 10..
 */
public class Hero extends Character {

  int tileSize = 72;

  public Hero(int posX, int posY) {
    super("assets/hero-down.png", posX, posY);
  }


  public void moveUp() {
    this.posY -= tileSize;
    setImage("assets/hero-up.png");
  }

  public void moveDown() {
    this.posY += tileSize;
    setImage("assets/hero-down.png");
  }

  public void moveLeft() {
    this.posX -= tileSize;
    setImage("assets/hero-left.png");
  }

  public void moveRight() {
    this.posX += tileSize;
    setImage("assets/hero-Right.png");
  }
}
