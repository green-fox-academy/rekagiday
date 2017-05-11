import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 2017. 05. 11..
 */
public class Kata {

  public static boolean getAnagram(String first, String second) {

    try {
      char[] firstWord = first.toLowerCase().toCharArray();
      char[] secondWord = second.toLowerCase().toCharArray();

      Arrays.sort(firstWord);
      Arrays.sort(secondWord);

      if (first.length() == second.length() && Arrays.equals(firstWord, secondWord)) {
        return true;
      }
      return false;
    } catch (Exception e) {
      return false;
    }
  }

  public static String fizzBuzz(Integer number) {

    try {
      if (number > 0 && number <= 100) {
        if (number % 3 == 0 && number % 5 == 0) {
          return "FizzBuzz";
        } else if (number % 3 == 0) {
          return "Fizz";
        } else if (number % 5 == 0) {
          return "Buzz";
        }
        return number.toString();
      } else
        return "not valid";
    } catch (Exception e) {
      return "not valid";
    }
  }
}
