import java.lang.*;

/**
 * Created by User on 2017. 04. 10..
 */
public class Monster extends Character {

  public Monster(int posX, int posY) {
    super("assets/skeleton.png", posX, posY);
    this.posX = posX;
    this.posY = posY;
    this.hp = 2 * level * d6;
    this.dp = level / 2 * d6;
    this.sp = level * d6;
  }

  public void moveMonster() {
    int x = posX / tileSize;
    int y = posY / tileSize;
    int directionRandomizer = (int) (Math.random() * 4);

    if (directionRandomizer == 0 && posY >= tileSize /*  && !isWall(x, y - 1)*/) {
      moveUp();
    } else if (directionRandomizer == 2 && posY < tileSize * 9 /* && !isWall(x, y + 1)*/) {
      moveDown();
    } else if (directionRandomizer == 3 && posX < tileSize * 9 /* && !isWall(x + 1, y)*/) {
      moveRight();
    } else if (directionRandomizer == 1 && posX > tileSize /*&& !isWall(x - 1, y)*/) {
      moveLeft();
    }
  }
}
