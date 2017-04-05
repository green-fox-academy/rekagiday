package tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_4and5is9() {
    assertEquals(9, extension.add(4, 5));
  }

  @Test
  void testAdd_1and1is2() {
    assertEquals(2, extension.add(1, 1));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(3, extension.maxOfThree(2, 1, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(4, 5, 3));
  }

  @Test
  void testMedian_four() {
    assertEquals(4.5, extension.median(Arrays.asList(1d, 4d, 100d, 5d)));
  }

  @Test
  void testMedian_five() {
    assertEquals(4, extension.median(Arrays.asList(3., 2., 4., 5., 6.)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("avaszttaval", extension.translate("asztal"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("kivicsivi", extension.translate("kicsi"));
  }
}