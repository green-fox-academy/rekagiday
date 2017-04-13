import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.nio.file.Files;

/**
 * Created by User on 2017. 04. 10..
 */
public class Character extends GameObject {

  double hp, dp, sp;

  public Character() {
  }

  public Character(String filename, int posX, int posY) {
    super(filename, posX, posY);
  }

//  public boolean isFloor(int x, int y) {
//    Board board = new Board();
//    return (posX >= tileSize || posX < tileSize * 9 && !board.tiles.isWall(x, y));
//  }

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
