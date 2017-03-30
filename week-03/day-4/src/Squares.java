import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

  static int WIDTH = 900;

  private static void mainDraw(Graphics graphics) {
    fractals(graphics, 0, 0, WIDTH);
  }

  private static void drawLine(Graphics graphics, int x, int y, int i) {
    graphics.setColor(Color.black);
    graphics.drawLine(x + i / 3, y, x + i / 3, y + i);
    graphics.drawLine(x + i / 3 * 2, y, x + i / 3 * 2, y + i);
    graphics.drawLine(x, y + i / 3, x + i, y + i / 3);
    graphics.drawLine(x, y + i / 3 * 2, x + i, y + i / 3 * 2);
  }

  private static void fractals(Graphics graphics, int x, int y, int i) {
    if (i > 0) {
      drawLine(graphics, x, y, i);
      fractals(graphics, x + (i / 3), y, i / 3);
      fractals(graphics, x, y + (i / 3), i / 3);
      fractals(graphics, x + ((i / 3) * 2), y + (i / 3), i / 3);
      fractals(graphics, x + (i / 3), y + ((i / 3) * 2), i / 3);
    }
  }

  public static void main(String[] args) {

    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, WIDTH));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);
    }
  }
}
