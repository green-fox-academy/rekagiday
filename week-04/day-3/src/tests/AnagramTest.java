package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by User on 2017. 04. 05..
 */
public class AnagramTest {
  Anagram words;

  @BeforeEach
  void addWords(){
    words = new Anagram();
  }

  @Test
  void checkAnagram() {
    assertEquals(true, words.anagramChecker("alma", "lama"));
  }
}
