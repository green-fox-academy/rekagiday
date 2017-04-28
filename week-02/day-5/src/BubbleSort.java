import java.util.Scanner;

public class BubbleSort {

  public static void main(String[] args) {
    System.out.println("Please enter a nice little sentence that I can sort for you:");
    Scanner scanner = new Scanner(System.in);
    String toBeSorted = scanner.nextLine();
    toBeSorted = toBeSorted.toLowerCase();
    for (int i = 0; i < toBeSorted.length(); i++) {
      for (int j = i; j < toBeSorted.length(); j++) {
        if (toBeSorted.charAt(i) > toBeSorted.charAt(j)) {
          toBeSorted = toBeSorted.substring(0, i)
              + toBeSorted.charAt(j)
              + toBeSorted.substring(i + 1, j)
              + toBeSorted.charAt(i)
              + toBeSorted.substring(j + 1, toBeSorted.length());
        }
      }
    }
    System.out.println(toBeSorted);
  }
}