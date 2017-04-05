package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by User on 2017. 04. 05..
 */
public class FibonacciTest {

  Fibonacci a = new Fibonacci();

  @Test
  void testFibo1() {
    assertEquals(21, a.fibonacci(8));
  }

  @Test
  void testFibo2() {
    assertEquals(0, a.fibonacci(0));
  }

  @Test
  void testFibo3() {
    assertEquals(-1, a.fibonacci(-7));
  }

  @Test
  void testFibo4() {
    assertEquals(1, a.fibonacci(1));
  }
}
