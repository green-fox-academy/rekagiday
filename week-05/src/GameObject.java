/**
 * Created by User on 2017. 04. 10..
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameObject{


  int tileSize, posX, posY;
  int level;
  int d6;

  BufferedImage image;

  public GameObject() {
  }

  public GameObject(String filename, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    this.tileSize = 72;
    this.level = 1;
    d6 = (int) (Math.random() *6);
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }

  void setImage(String filename) {
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }





}




