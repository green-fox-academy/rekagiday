import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.

    int x = 0;
    int y = 0;

    for (int i = 0; i < 15; i++) {
      DrawToCenter(x, y, graphics);
      x += 20;
    }
    x = 0;
    y = 300;
    for (int i = 0; i < 15; i++) {
      DrawToCenter(x, y, graphics);
      x += 20;
    }

    x = 0;
    y = 0;
    for (int i = 0; i < 15; i++) {
      DrawToCenter(x, y, graphics);
      y += 20;
    }
    x = 300;
    y = 0;
    for (int i = 0; i < 15; i++) {
      DrawToCenter(x, y, graphics);
      y += 20;
    }



  }


  private static void DrawToCenter(int x, int y, Graphics graphics) {

    graphics.drawLine(x, y, 150, 150);


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