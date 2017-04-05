package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Created by User on 2017. 04. 05..
 */
public class AppleTest {

  @Test

  void testIfApple() {
    assertEquals("apple", Apple.getApple());
  }
}
