import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by User on 2017. 03. 31..
 */
public class SierpinskyCarpet {

  static int WIDTH = 900;

  private static void mainDraw(Graphics graphics) {
    fractals(graphics, WIDTH / 3, WIDTH / 3, WIDTH / 3);
  }


  private static void fractals(Graphics graphics, int x, int y, int i) {
    if (i > 0) {
      graphics.setColor(new Color(randomColor()));
      graphics.fillRect(x, y, i, i);
      fractals(graphics, x - (i * 2 / 3), y - (i * 2 / 3), i / 3);
      fractals(graphics, x + (i / 3), y - (i * 2 / 3), i / 3);
      fractals(graphics, x + i + (i / 3), y - (i * 2 / 3), i / 3);

      fractals(graphics, x - (i * 2 / 3), y + (i / 3), i / 3);
      fractals(graphics, x + i + (i / 3), y + (i / 3), i / 3);

      fractals(graphics, x - (i * 2 / 3), y +i+ (i / 3), i / 3);
      fractals(graphics, x + (i / 3), y + i + (i / 3), i / 3);
      fractals(graphics, x + i + (i / 3), y + i + (i / 3), i / 3);
    }
  }

  public static int randomColor() {
    int randomColor = (int) (Math.random() * 16777216);
    return randomColor;
  }


  public static void main(String[] args) {

    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH+20, WIDTH+43));
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



