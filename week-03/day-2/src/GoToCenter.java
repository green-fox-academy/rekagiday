import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

  public static void mainDraw(Graphics graphics){

    DrawToCenter(30, 10, graphics);
    DrawToCenter(230, 300, graphics);
    DrawToCenter(0, 190, graphics);

  }

  private static void DrawToCenter(int x, int y, Graphics graphics) {

    graphics.drawLine(x, y, 150, 150);

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