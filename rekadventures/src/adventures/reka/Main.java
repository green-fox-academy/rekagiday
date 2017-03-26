package adventures.reka;

import java.util.Scanner;

public class Main {

  static final char SYMBOL_USER = '*';
  static final char SYMBOL_TRAP = '@';
  static final char SYMBOL_FIELD = '_';


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter your name");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name
        + "! This is where you start. (*). Try to find the treasure chest (#). Avoid the traps (@) and fight monsters (M)!");

    int userPosX = 0;
    int userPosY = 0;
    int userHp = 3;
    int[] trapPosX = {3, 2, 4, 8};
    int[] trapPosY = {1, 5, 7, 2};

    while (userHp > 0) {

      int fieldSize = 10;
      char[][] field = new char[fieldSize][fieldSize];

      for (int y = 0; y < fieldSize; y++) {
        for (int x = 0; x < fieldSize; x++) {
          if (y == userPosY && x == userPosX) {
            field[y][x] = SYMBOL_USER;
          } else {
            for (int trapIndex = 0; trapIndex < trapPosX.length; trapIndex++) {
              if (y == trapPosY[trapIndex] && x == trapPosX[trapIndex]) {
                field[y][x] = SYMBOL_TRAP;
              } else if (field[y][x] != SYMBOL_TRAP && field[y][x] != SYMBOL_USER) {
                field[y][x] = SYMBOL_FIELD;
              }
            }
          }
        }
      }
      for (int y = 0; y < fieldSize; y++) {
        for (int x = 0; x < fieldSize; x++) {
          System.out.print(field[y][x] + " ");
        }
        System.out.println();
      }

      System.out.println("Please let me know which way you want to go! "
          + "North, east, south or west? (Type n, e, s or w). Type exit to exit. ");
      String move = scanner.nextLine();

      if (move.equals("exit")) {
        break;
      } else if (move.equals("w")) {
        if (userPosX > 0) {
          System.out.println("You moved 1 step to west.");
          userPosX--;
        } else {
          System.out.println("You reached the border of the playfield. "
              + "Please move in any other available direction.");
        }
      } else if (move.equals("e")) {
        if (userPosX < fieldSize - 1) {
          System.out.println("You moved 1 step to east.");
          userPosX++;
        } else {
          System.out.println("You reached the border of the playfield. "
              + "Please move in any other available direction.");
        }

      } else if (move.equals("n")) {
        if (userPosY > 0) {
          userPosY--;
          System.out.println("You moved 1 step to north.");
        } else {
          System.out.println("You reached the border of the playfield. "
              + "Please move in any other available direction.");
        }
      } else if (move.equals("s")) {
        if (userPosY < fieldSize - 1) {
          userPosY++;
          System.out.println("You moved 1 step to south.");
        } else {
          System.out.println("You reached the border of the playfield. "
              + "Please move in any other available direction.");
        }
      } else {
        System.out.println("Wrong direction. Please move or exit. ");
      }

      if (field[userPosY][userPosX] == SYMBOL_TRAP) {
        userHp--;
        System.out.println("You stepped on a trap and lost 1 hp! Your current hp is: " + userHp);
      }
    }
    System.out.println("You died! :( NOOB");
  }
}

