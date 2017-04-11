import java.awt.Graphics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 2017. 04. 10..
 */
public class Tile extends Board {

  int size;
  int posX;
  int posY;
  String[][] board = new String[10][10];
  Path path;

  void fillBoard(String levelPath) {
    this.path = Paths.get(levelPath);
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        String[] line = lines.get(i).split(" ");
        board[i] = line;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public Tile() {
  }

  boolean isWall(int x, int y) {
    if ((board[x][y]).equals("1")) {
      return true;
    } else {
      return false;
    }
  }


  void drawTile(Graphics graphics) {
    size = 72;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (!isWall(i, j)) {
          GameObject tile = new GameObject("assets/floor.png", j * size, i * size);
          tile.draw(graphics);
        } else {
          GameObject tile = new GameObject("assets/wall.png", j * size, i * size);
          tile.draw(graphics);
        }
      }
    }
  }
}
