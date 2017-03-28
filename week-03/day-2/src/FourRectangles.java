import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics) {
    // draw four different size and color rectangles.

    graphics.setColor(Color.CYAN);
    graphics.fillRect(10, 10, 200, 100);

    graphics.setColor(Color.GREEN);
    graphics.fillRect(100, 250, 55, 30);

    graphics.setColor(Color.MAGENTA);
    graphics.fillRect(150, 150, 100, 100);

    graphics.setColor(Color.YELLOW);
    graphics.fillRect(0, 50, 15, 15);


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