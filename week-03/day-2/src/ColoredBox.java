/**
 * Created by User on 2017. 03. 28..
 */
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics) {

    graphics.setColor(Color.MAGENTA);
    graphics.drawLine(10,10,100,10);
    graphics.setColor(Color.YELLOW);
    graphics.drawLine(100,10,100,100);
    graphics.setColor(Color.CYAN);
    graphics.drawLine(100,100,10,100);
    graphics.setColor(Color.ORANGE);
    graphics.drawLine(10,10,10,100);

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

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}

