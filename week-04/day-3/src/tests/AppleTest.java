package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppleTest {

  @Test
  void testIfApple() {
    assertEquals("apple", Apple.getApple());
  }
}

