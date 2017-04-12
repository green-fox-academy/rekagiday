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


}