package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LetterCounterTest {
  LetterCounter myCounter;
  HashMap<Character, Integer> testMap;

  @BeforeEach
  void createString() {
    myCounter = new LetterCounter();
    testMap = new HashMap<>();
    testMap.put('k', 1);
    testMap.put('i', 2);
    testMap.put('s', 1);
    testMap.put('c', 2);
    testMap.put('a', 1);
  }

  @Test
  void letterCounterTest(){
    System.out.println(myCounter.letterCounter("kiscica"));
    assertEquals(testMap, myCounter.letterCounter("kiscica"));
  }
}

