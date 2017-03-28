import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

  public static void mainDraw(Graphics graphics) {

    int[] fox = {50, 100, 70, 70, 80, 90, 90, 90, 100, 70, 120, 100, 85, 130, 50, 100};
    int[] box = {10, 10, 290, 10, 290, 290, 10, 290};
    connectDots(box, graphics);
    connectDots(fox, graphics);
  }

  private static void connectDots(int[] shape, Graphics graphics) {

    graphics.setColor(Color.GREEN);

    for (int i = 0; i < shape.length; i += 2) {
      if (i < shape.length - 2) {
        graphics.drawLine(shape[i], shape[i + 1], shape[i + 2], shape[i + 3]);
      } else {
        graphics.drawLine(
            shape[i], shape[i + 1], shape[i - (shape.length - 2)], shape[i - (shape.length-3)]);
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

// create a 300x300 canvas.