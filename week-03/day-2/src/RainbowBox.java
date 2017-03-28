import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {

  public static void mainDraw(Graphics graphics) {

    int size = 300;

    for (int i = 0; i < 25; i++) {
      int color = (int) (Math.random() * 16777216);
      size -= 25;
      DrawRainbowSquares(size, color, graphics);
    }
  }

  private static void DrawRainbowSquares(int size, int color, Graphics graphics) {

      graphics.setColor(new Color(color));
      graphics.fillRect((150 - size / 2), (150 - size / 2), size, size);

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
