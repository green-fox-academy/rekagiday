/**
 * Created by User on 2017. 04. 19..
 */
public class SortArray {
//
//  Create a generic method that <T extends Number> so converting to primitive number types is available
//  This method takes an array in parameter, and sort it in a descending order
//  Pro tip: Temporary values/arrays help a lot
//  Whether or not you had an exception print out the elements of the array


  public static <T extends Comparable<T>> void sortArray (T[] array) {

    T[] tempArray;

    for (T element: array) {

    }
  }

  public static void main(String[] args) {
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
  }
}

