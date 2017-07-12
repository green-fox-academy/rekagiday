package reka;

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    double positiveCount = 0.0, negativeCount = 0.0, zeroCount = 0.0;
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      if (num == 0) {
        zeroCount++;
      } else if (num > 0) {
        positiveCount++;
      } else {
        negativeCount++;
      }
    }

    System.out.println(positiveCount / n);
    System.out.println(negativeCount / n);
    System.out.println(zeroCount / n);
    System.out.println(multiplesOf3and5(1000));
  }

  public static int multiplesOf3and5(int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
