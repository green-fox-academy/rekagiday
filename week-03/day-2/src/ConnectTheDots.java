import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

  public static void mainDraw(Graphics graphics) {

    int[][] fox = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130},
        {50, 100}};
    int[][] box = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
    connectDotsV2(box, graphics);
    connectDotsV2(fox, graphics);
  }

  private static void connectDotsV2(int[][] shape, Graphics graphics) {
    graphics.setColor(Color.GREEN);

    for (int i = 0; i < shape.length; i ++) {
      if (i < shape.length - 1) {
        graphics.drawLine(shape[i][0], shape[i][1], shape[i + 1][0], shape[i + 1][1]);
      } else {
        graphics.drawLine(shape[i][0], shape[i][1], shape[i - (shape.length - 1)][0],
            shape[i - (shape.length - 1)][1]);
      }
    }
  }

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
