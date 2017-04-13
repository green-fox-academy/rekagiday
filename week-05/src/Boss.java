/**
 * Created by User on 2017. 04. 13..
 */
public class Boss extends Character {

  public Boss(int posX, int posY) {
    super("assets/boss.png", posX, posY);
    this.posX = posX;
    this.posY = posY;
    this.hp = 2 * level * d6;
    this.dp = level / 2 * d6;
    this.sp = level * d6;
  }
}
