package adventures.reka;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter your name");
    String name = scanner.nextLine();
    System.out.println(
        "Hello," + name + ". Please let me know which way you want to go (left, forward, right)");
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
