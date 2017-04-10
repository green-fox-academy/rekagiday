import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int posX;
  int posY;
  Tile tiles;
  int tileSize;


  public Board() {
    posX = 0;
    posY = 0;
    tileSize = 72;
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    PositionedImage hero = new PositionedImage("assets/hero-down.png", posX, posY);
    PositionedImage boss = new PositionedImage("assets/boss.png", tileSize * 9, 0);
    tiles = new Tile();
    tiles.fillBoard("assets/level1.csv");
    tiles.drawTile(graphics);
    boss.draw(graphics);
    hero.draw(graphics);
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
    int currentPosX = posX;
    int currentPosY = posY;
    int x = currentPosX / tileSize;
    int y = currentPosY / tileSize;

    if (e.getKeyCode() == KeyEvent.VK_UP && currentPosY >= tileSize) {
      posY -= tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && currentPosY < tileSize * 9) {
      posY += tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && currentPosX >= tileSize) {
      posX -= tileSize;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && currentPosX < tileSize * 9) {
      posX += tileSize;
    }
    repaint();
  }
}