package adventures.reka;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  private static final char SYMBOL_USER = '*';
  private static final char SYMBOL_TRAP = '@';
  private static final char SYMBOL_FIELD = '_';

  private static void createMap(int fieldSize, int userPosY, int userPosX, char[][] field) {

    int[] trapPosX = {3, 2, 4, 8};
    int[] trapPosY = {1, 5, 7, 2};

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
  }

  private static void drawMap(int fieldSize, char[][] field) {
    for (int y = 0; y < fieldSize; y++) {
      for (int x = 0; x < fieldSize; x++) {
        System.out.print(field[y][x] + " ");
      }
      System.out.println();
    }
  }


  private static int makeMove(String direction, int initialPosition) {

    System.out.println("You moved 1 step to " + direction + ".");

    if (direction.equals("west") || direction.equals("north")) {
      return initialPosition - 1;
    } else {
      return initialPosition + 1;
    }
  }

  private static boolean validateMove(String direction, int userPosY, int userPosX, int fieldSize) {

    if (direction.equals("west") && userPosX > 0
        || direction.equals("east") && userPosX < fieldSize - 1
        || direction.equals("south") && userPosY < fieldSize - 1
        || direction.equals("north") && userPosY > 0) {
      return true;
    } else {
      System.out.println("You reached the border of the playfield. "
          + "Please move in any other available direction.");
      return false;
    }
  }

  private static Map<String, Integer> moveUser(String move, int userPosY, int userPosX,
      int fieldSize, char[][] field, int userHp) {

    if (move.equals("w") && validateMove("west", userPosY, userPosX, fieldSize)) {
      userPosX = makeMove("west", userPosX);
    } else if (move.equals("e") && validateMove("east", userPosY, userPosX, fieldSize)) {
      userPosX = makeMove("east", userPosX);
    } else if (move.equals("n") && validateMove("north", userPosY, userPosX, fieldSize)) {
      userPosY = makeMove("north", userPosY);
    } else if (move.equals("s") && validateMove("south", userPosY, userPosX, fieldSize)) {
      userPosY = makeMove("south", userPosY);
    } else {
      System.out.println("Wrong direction. Please move or exit. ");
    }

    if (field[userPosY][userPosX] == SYMBOL_TRAP) {
      userHp--;
      System.out.println("You stepped on a trap and lost 1 hp! Your current hp is: " + userHp);
    }
    Map<String, Integer> moveResults = new HashMap<>();
    moveResults.put("userPosX", userPosX);
    moveResults.put("userPosY", userPosY);
    moveResults.put("userHp", userHp);

    return moveResults;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter your name");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name
        + "!  \nThis is where you start. (*). \nTry to reach the treasure chest (#). \nAvoid the traps (@) an  and fight monsters (M) for xp!");

    int userPosX = 0;
    int userPosY = 0;
    int userHp = 3;

    while (userHp > 0) {

      int fieldSize = 10;
      char[][] field = new char[fieldSize][fieldSize];

      createMap(fieldSize, userPosY, userPosX, field);
      drawMap(fieldSize, field);

      System.out.println("Please let me know which way you want to go! "
          + "North, east, south or west? (Type n, e, s or w). Type exit to exit. ");
      String move = scanner.nextLine();
      if (move.equals("exit")) {
        break;
      } else {
        Map<String, Integer> moveResults = moveUser(move, userPosY, userPosX, fieldSize, field,
            userHp);
        userPosY = moveResults.get("userPosY");
        userPosX = moveResults.get("userPosX");
        userHp = moveResults.get("userHp");
      }
    }
    System.out.println("You died! :( NOOB");
  }
}