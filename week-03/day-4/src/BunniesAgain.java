/**
 * Created by User on 2017. 03. 30..
 */
public class BunniesAgain {

  public static void main(String[] args) {
    System.out.println(bunnyEars(20));
  }

  private static int bunnyEars(int bunny) {

    int sum = 0;
    int ears = 0;
    if (bunny == 0) {
      return 0;
    }
    else {
      if (bunny % 2 == 0)  {
        sum = ears + 2 + bunnyEars(bunny - 1);
      } else if (bunny % 2 == 1) {
        sum = ears + 3 + bunnyEars(bunny - 1);
      }
    } return sum;
  }
}

