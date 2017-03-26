package adventures.reka;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter your name");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "! This is where you start. (*). Try to find the treasure chest (#). Avoid the traps (@) and fight monsters (M)!");

    int userPosX = 0;
    int userPosY = 0;

    while (true) {

      int fieldSize = 10;
      char[][] field = new char[fieldSize][fieldSize];

      for (int i = 0; i < fieldSize; i++) {
        for (int j = 0; j < fieldSize; j++) {
          if (i == userPosX && j == userPosY) {
            field[i][j] = '*';
          } else {
            field[i][j] = '_';
          }
        }
      }
      for (int i = 0; i < fieldSize; i++) {
        for (int j = 0; j < fieldSize; j++) {
          System.out.print(field[i][j] + " ");
        }
        System.out.println();
      }

      System.out.println("Please let me know which way you want to go! North, east, south or west? (Type n, e, s or w)");
      String move = scanner.nextLine();



      if (move.equals("w")) {
        System.out.println("You moved 1 step to west.");
      } else if (move.equals("e")) {
        System.out.println("You moved 1 step to east.");
      } else if (move.equals("n")) {
        System.out.println("You moved 1 step to north.");
      } else if (move.equals("s")) {
        System.out.println("You moved 1 step to south.");
      } else {
        System.out.println("Wrong direction. Please move or die. ");
      }
    }
  }
}
