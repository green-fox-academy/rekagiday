package adventures.reka;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter your name");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "! This is where you start. (*). Try to find the treasure chest (#). Avoid the traps (@) and fight monsters (M)!");

    while (true) {

      int fieldSize = 10;
      char[][] field = new char[fieldSize][fieldSize];

      for (int i = 0; i < fieldSize; i++) {
        for (int j = 0; j < fieldSize; j++) {
          field[i][j] = '_';
        }
      }
      for (int i = 0; i < fieldSize; i++) {
        for (int j = 0; j < fieldSize; j++) {
          System.out.print(field[i][j] + " ");
        }
        System.out.println();
      }

      System.out.println("Please let me know which way you want to go (left, forward, right)");
      String move = scanner.nextLine();



      if (move.equals("left")) {
        System.out.println("You moved 1 step to the left.");
      } else if (move.equals("right")) {
        System.out.println("You moved 1 step to the right.");
      } else if (move.equals("forward")) {
        System.out.println("You moved 1 step forward.");
      } else {
        System.out.println("Wrong direction. Please move or die. ");
      }
    }
  }
}
