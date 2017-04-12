import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  Tile tiles;
  int tileSize;
  Hero hero;
  Monster monster;


  public Board() {
    hero = new Hero(0, 0);
    tileSize = 72;
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    tiles = new Tile();
    tiles.fillBoard("assets/level1.csv");
    tiles.drawTile(graphics);
    hero.draw(graphics);
    monster.draw(graphics);

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

  public void keyTyped(KeyEvent e) {
  }

  public void keyPressed(KeyEvent e) {
  }

  public void keyReleased(KeyEvent e) {
    int x = hero.posX / tileSize;
    int y = hero.posY / tileSize;

    if (e.getKeyCode() == KeyEvent.VK_UP && hero.posY >= tileSize && !tiles.isWall(x, y - 1)) {
      hero.moveUp();
      hero.moveCount++;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY < tileSize * 9 && !tiles
        .isWall(x, y + 1)) {
      hero.moveCount++;
      hero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && hero.posX >= tileSize && !tiles
        .isWall(x - 1, y)) {
      hero.moveLeft();
      hero.moveCount++;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && hero.posX < tileSize * 9 && !tiles
        .isWall(x + 1, y)) {
      hero.moveRight();
      hero.moveCount++;
    }
    repaint();
  }
}
