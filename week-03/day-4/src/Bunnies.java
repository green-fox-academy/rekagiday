/**
 * Created by User on 2017. 03. 30..
 */
public class Bunnies {

  public static void main(String[] args) {
    System.out.println(bunnyEars(30));
  }

  private static int bunnyEars(int bunny) {
    if (bunny == 0) {
      return 0;
    }
    else {
      int ears = 0;
      return ears + 2 + bunnyEars(bunny - 1);
    }
  }
}

