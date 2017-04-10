import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int posX;
  int posY;

  public Board() {
    posX = 0;
    posY = 0;

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    PositionedImage image = new PositionedImage("assets/hero-down.png", posX, posY
    );

    for (int j = 0; j < 720; j += 72) {
      for (int i = 0; i < 720; i += 72) {
        PositionedImage tile = new PositionedImage("assets/floor.png", j, i);
        tile.draw(graphics);
      }
    }
    image.draw(graphics);
  }


  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      posY -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      posY += 72;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      posX -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      posX += 72;
    }
    repaint();
  }
}