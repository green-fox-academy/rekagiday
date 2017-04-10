import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.lang.*;

/**
 * Created by User on 2017. 04. 10..
 */
public class Hero extends Character {

  int posX;
  int posY;

  void drawHero(Graphics graphics){
    PositionedImage hero = new PositionedImage("assets/hero-down.png", posX, posY);
  }

}
