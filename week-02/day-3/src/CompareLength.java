/**
 * Created by User on 2017. 03. 22..
 */
public class CompareLength {
  public static void main(String[] args) {

    int[] p1 = {1, 2, 3};
    int[] p2 = {4, 5};

    if (p1.length > p2.length) {
      System.out.println("the first list has more elements");
    } else if (p1.length < p2.length) {
      System.out.println("the second list has more elements");
    }  if (p1.length == p2.length) {
      System.out.println("the two lists have the same amount of elements");
    }

  }
}
