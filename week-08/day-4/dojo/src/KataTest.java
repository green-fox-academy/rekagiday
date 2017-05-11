import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * Created by User on 2017. 05. 11..
 */
public class KataTest {


  @Test
  public void testGetAnagram() {
    assertEquals(false, Kata.getAnagram("al", "ab"));
  }

  @Test
  public void testGetAnagramTwo() {
    assertEquals(true, Kata.getAnagram("al", "la"));
  }

  @Test
  public void testGetAnagramThree() {
    assertEquals(false, Kata.getAnagram("aba", "la"));
  }

  @Test
  public void testGetAnagramFour() {
    assertEquals(true, Kata.getAnagram("aba", "aAb"));
  }

  @Test
  public void testGetAnagramFive() {
    assertEquals(false, Kata.getAnagram("ab", "lm"));
  }

  @Test
  public void testGetAnagramSix() {
    assertEquals(false, Kata.getAnagram(null, null));
  }

  @Test
  public void testGetAnagramSeven() {
    assertEquals(true, Kata.getAnagram("", ""));
  }


  @Test
  public void testFizzBuzz() {
    assertEquals("2", Kata.fizzBuzz(2));
  }

  @Test
  public void testFizzBuzzTwo() {
    assertEquals("Fizz", Kata.fizzBuzz(3));
  }

  @Test
  public void testFizzBuzzThree() {
    assertEquals("FizzBuzz", Kata.fizzBuzz(30));
  }

  @Test
  public void testFizzBuzzFour() {
    assertEquals("not valid", Kata.fizzBuzz(101));
  }

  @Test
  public void testFizzBuzzFive() {
    assertEquals("not valid", Kata.fizzBuzz(null));
  }
}

