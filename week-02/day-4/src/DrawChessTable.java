/**
 * Created by User on 2017. 03. 23..
 */
public class DrawChessTable {

  public static void main(String[] args) {
    char[][] chessTable = new char[8][8];

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (i % 2 == 1) {
          if (j % 2 == 1) {
            chessTable[i][j] = '#';
          } else {
            chessTable[i][j] = ' ';
          }
        } else {
          if (j % 2 == 0) {
            chessTable[i][j] = '#';
          } else {
            chessTable[i][j] = ' ';
          }
        }
      }
    }

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.print(chessTable[i][j] + " ");
      }
      System.out.println();
    }
  }
}
