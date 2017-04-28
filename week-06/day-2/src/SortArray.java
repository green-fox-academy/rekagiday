import java.util.Arrays;
import java.util.Collections;

/**
 * Created by User on 2017. 04. 19..
 */
public class SortArray {

  private static <T extends Number> void sortArray(T[] array) {

    Arrays.sort(array, Collections.reverseOrder());

    for (T element : array) {
      System.out.print(element + ", ");
    }
  }

  public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};

    sortArray(intArray);
    sortArray(doubleArray);

  }
}

