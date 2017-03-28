import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {

  public static void mainDraw(Graphics graphics){


    DrawHorizontalLine(20,20, graphics);
    DrawHorizontalLine(0,100, graphics);
    DrawHorizontalLine(200,160, graphics);

  }

  private static void DrawHorizontalLine(int x, int y, Graphics graphics) {

    graphics.drawLine(x, y, x+50,y);

  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}