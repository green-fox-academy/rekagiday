/**
 * Created by User on 2017. 03. 21..
 */

import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number of girls attending to the party");
    int girls = scanner.nextInt();

    System.out.println("Please enter the number of boys attending to the party");
    int boys = scanner.nextInt();

    if (girls == boys && girls+boys> 20) {
      System.out.println("The party is excellent!");
    }
    else if (girls == 0){
      System.out.println("Sausage party...");
    }
    else if (girls != boys && girls+boys> 20) {
      System.out.println("Quite cool party!");
    }
    else if (girls+boys < 20) {
      System.out.println("Average party...");
    }
  }
}
