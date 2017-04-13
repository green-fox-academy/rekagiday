import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  Tile tiles;
  int tileSize;
  Hero hero;
  ArrayList<Monster> monsters;
  String levelPath;
  Character c;


  public Board() {
    c = new Character();
    levelPath = "assets/level" + c.getLevel() + ".csv";
    tiles = new Tile();
    tiles.fillBoard(levelPath);
    tileSize = 72;
    hero = new Hero(0, 0);
    monsters = new ArrayList<>();

    while (monsters.size() < 3) {
      Monster monster = new Monster((int) (Math.random() * 7 + 2) * tileSize,
          (int) (Math.random() * 7 + 2) * tileSize);
      if (!tiles.isWall(monster.getPosX() / tileSize, monster.getPosY() / tileSize)) {
        monsters.add(monster);
      }
    }
    setPreferredSize(new Dimension(tileSize * 10, tileSize * 10));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    tiles.drawTile(graphics);
    hero.draw(graphics);
    for (int i = 0; i < monsters.size(); i++) {
      monsters.get(i).draw(graphics);
    }
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
      if (hero.moveCount % 2 == 0) {
        for (int i = 0; i < monsters.size(); i++) {
          monsters.get(i).moveMonster(tiles);
        }
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY < tileSize * 9 && !tiles
        .isWall(x, y + 1)) {
      hero.moveDown();
      if (hero.moveCount % 2 == 0) {
        for (int i = 0; i < monsters.size(); i++) {
          monsters.get(i).moveMonster(tiles);
        }
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && hero.posX >= tileSize && !tiles
        .isWall(x - 1, y)) {
      hero.moveLeft();
      if (hero.moveCount % 2 == 0) {
        for (int i = 0; i < monsters.size(); i++) {
          monsters.get(i).moveMonster(tiles);
        }
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && hero.posX < tileSize * 9 && !tiles
        .isWall(x + 1, y)) {
      hero.moveRight();
      if (hero.moveCount % 2 == 0) {
        for (int i = 0; i < monsters.size(); i++) {
          monsters.get(i).moveMonster(tiles);
        }
      }
    }
    repaint();
  }
}
