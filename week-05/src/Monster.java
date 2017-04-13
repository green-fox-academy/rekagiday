import java.lang.*;

/**
 * Created by User on 2017. 04. 10..
 */
public class Monster extends Character {

  public Monster() {
  }

  public Monster(int posX, int posY) {
    super("assets/skeleton.png", posX, posY);
    this.posX = posX;
    this.posY = posY;
    this.hp = 2 * level * d6;
    this.dp = level / 2 * d6;
    this.sp = level * d6;
  }

  public void moveMonster(Tile tiles) {
    int x = this.getPosX() / tileSize;
    int y = this.getPosY() / tileSize;

    boolean step = false;

    while (!step) {
      int directionRandomizer = (int) (Math.random() * 4);
      if (directionRandomizer == 0 && y >= 1 && !tiles.isWall(x, y - 1)) {
        moveUp();
        step = true;
      } else if (directionRandomizer == 1 && x > 1 && !tiles.isWall(x - 1, y)) {
        moveLeft();
        step = true;
      } else if (directionRandomizer == 2 && y < 9 && !tiles.isWall(x, y + 1)) {
        moveDown();
        step = true;
      } else if (directionRandomizer == 3 && x < 9 && !tiles.isWall(x + 1, y)) {
        moveRight();
        step = true;
      }
    }
  }
}
