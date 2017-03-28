import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {

  public static void mainDraw(Graphics graphics){

    DrawCenteredSquare(100, graphics);
    DrawCenteredSquare(50, graphics);
    DrawCenteredSquare(200, graphics);

  }

  private static void DrawCenteredSquare(int size, Graphics graphics) {

    graphics.drawRect((150-size/2), (150-size/2), size, size);

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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
