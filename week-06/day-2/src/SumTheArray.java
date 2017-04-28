/**
 * Created by User on 2017. 04. 28..
 */
public class SumTheArray {

  private static <T extends Number> void sumArray(T[] array, int index) {
    int total = 0;
    try {
      for (int i = 0; i < index; i++) {
        total = total + array[i].intValue();
      }
      for (T element : array) {
        System.out.print(element + ", ");
      }
      System.out.println("the total of the first " + index + " elements: " + total);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("index out of bound");
      for (T element : array) {
        System.out.println(element + ", ");
      }
      System.out.println("the total of the first " + index + " elements: " + total);
    }
  }

  public static void main(String[] args) {
    Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};
    sumArray(array, 7);
  }
}

