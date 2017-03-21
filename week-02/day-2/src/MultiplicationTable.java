/**
 * Created by User on 2017. 03. 21..
 */

import java.util.Scanner;

// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a number.");
    int myNumber = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " * " + myNumber + " = " + i*myNumber);
    }

  }
}
