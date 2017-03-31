import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by User on 2017. 03. 31..
 */
public class SquareGrid {

  static int WIDTH = 400;

  private static void mainDraw(Graphics graphics) {
    fractals(graphics, WIDTH / 4, WIDTH / 4, WIDTH / 2);
  }

  private static void fractals(Graphics graphics, int x, int y, int i) {
    if (i > 20) {
//      graphics.setColor(new Color(randomColor()));
      graphics.drawRect(x, y, i, i);

      fractals(graphics, (i / 4), (i / 4), i / 2);
      fractals(graphics, i + (i / 4), (i / 4), i / 2);
      fractals(graphics, (i / 4), i + (i / 4), i / 2);
      fractals(graphics, i + (i / 4), i + (i / 4), i / 2);
    }
  }

//  public static int randomColor() {
//    int randomColor = (int) (Math.random() * 16777216);
//    return randomColor;
//  }

  public static void main(String[] args) {

    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH + 20, WIDTH + 43));
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

