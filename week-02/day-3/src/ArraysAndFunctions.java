/**
 * Created by User on 2017. 03. 22..
 */
import java.util.Arrays;

public class ArraysAndFunctions {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    int[] numbersCopy = Arrays.copyOf(numbers, 5);
    int[] copyFromAnywhere = Arrays.copyOfRange(numbers, 3, 5);
    int[] longArray = new int[numbers.length+numbersCopy.length];

    for (int i=0; i < numbers.length; i++) {
      longArray[i] = numbers[i];
      longArray[numbers.length + i] = numbersCopy[i];
    }

    for(int currentNumber : numbers) {
      currentNumber = 3 + currentNumber;
      System.out.println(currentNumber);
    }

    // System.out.println(Arrays.toString(numbersCopy));
    // System.out.println(Arrays.toString(longArray));
    // printNumbersFrom0to5();
    //int sumValue = sumInputValues(13, 10);
    // System.out.println(sumValue);



  }
  public static void printNumbersFrom0to5() {
    for (int i = 10; i < 16; i++){
      System.out.println(i);
    }
  }

  public static int sumInputValues(int number1, int number2) {
    return number1+number2;
  }


  }


