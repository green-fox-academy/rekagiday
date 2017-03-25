/**
 * Created by User on 2017. 03. 23..
 */
public class DrawChessTable {

  public static void main(String[] args) {
    int size = 8;
    char[][] chessTable = new char[size][size];

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
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
        System.out.print(chessTable[i][j] + " ");
      }
      System.out.println();
    }
  }
}
