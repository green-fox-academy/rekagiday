import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.

    int size = 20;

    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 15; j++) {
        if (i % 2 == 0) {
          graphics.fillRect(i*20, j*40, size, size);
          } else {
          graphics.fillRect(i*20, size+(j*40), size, size);
        }
      }
    }
  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 343));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}