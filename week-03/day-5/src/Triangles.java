import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by User on 2017. 03. 31..
 */
public class Triangles {

  static int WIDTH = 900;

  private static void mainDraw(Graphics graphics) {
    fractals(graphics, 300, 300, WIDTH);
  }

  private static void drawTriangle(Graphics graphics, int x, int y, int i) {
    graphics.setColor(Color.black);
    int[] xPoints = {0, WIDTH, WIDTH/2};
    int[] yPoints = {0, 0, WIDTH};
    int nPoint = 3;
    i--;

    graphics.drawPolygon(xPoints,yPoints, nPoint);

  }

  private static void fractals(Graphics graphics, int x, int y, int i) {
    if (i > 0) {
      drawTriangle(graphics, x, y, i);
      fractals(graphics, x, y,  WIDTH);
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
      this.setBackground(Color.WHITE);
      mainDraw(graphics);
    }
  }
}



