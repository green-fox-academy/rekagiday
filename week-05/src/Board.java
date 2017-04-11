import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  Tile tiles;
  int tileSize;
  Hero hero;


  public Board() {
    hero = new Hero(0, 0);
    tileSize = 72;
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
//    GameObject hero = new GameObject(this.hero.image, this.hero.posX, this.hero.posY);
    tiles = new Tile();
    tiles.fillBoard("assets/level1.csv");
    tiles.drawTile(graphics);
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
    int currentPosX = hero.posX;
    int currentPosY = hero.posY;
    int x = currentPosX / tileSize;
    int y = currentPosY / tileSize;

    if (e.getKeyCode() == KeyEvent.VK_UP && currentPosY >= tileSize && !tiles.isWall(x, y - 1)) {
      hero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && currentPosY < tileSize * 9 && !tiles
        .isWall(x, y + 1)) {
      hero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && currentPosX >= tileSize && !tiles
        .isWall(x - 1, y)) {
      hero.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && currentPosX < tileSize * 9 && !tiles
        .isWall(x + 1, y)) {
      hero.moveRight();
    }
    repaint();
  }
}
