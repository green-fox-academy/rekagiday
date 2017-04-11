import java.nio.file.Files;

/**
 * Created by User on 2017. 04. 10..
 */
public class Character extends GameObject {
  double hp;
  double dp;
  double sp;

  public Character(String filename, int posX, int posY) {
    super(filename, posX, posY);
  }
}
