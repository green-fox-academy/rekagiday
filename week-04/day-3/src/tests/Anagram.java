package tests;

import java.util.Scanner;

/**
 * Created by User on 2017. 04. 05..
 */
public class Anagram {

  String firstWord;
  String secondWord;

  public boolean anagramChecker(String firstWord, String secondWord) {
    this.firstWord = secondWord;
    firstWord = firstWord.toLowerCase();
    for (int i = 0; i < firstWord.length(); i++) {
      for (int j = i; j < firstWord.length(); j++) {
        if (firstWord.charAt(i) > firstWord.charAt(j)) {
          firstWord = firstWord.substring(0, i)
              + firstWord.charAt(j)
              + firstWord.substring(i + 1, j)
              + firstWord.charAt(i)
              + firstWord.substring(j + 1, firstWord.length());
        }
      }
    }
    this.secondWord = secondWord;
    for (int i = 0; i < secondWord.length(); i++) {
      for (int j = i; j < secondWord.length(); j++) {
        if (secondWord.charAt(i) > secondWord.charAt(j)) {
          secondWord = secondWord.substring(0, i)
              + secondWord.charAt(j)
              + secondWord.substring(i + 1, j)
              + secondWord.charAt(i)
              + secondWord.substring(j + 1, secondWord.length());
        }
      }
    }

    if (firstWord.length() != secondWord.length()) {
      return false;
    } else if (firstWord.equals(secondWord)) {
      return true;
    } else {
      return false;
    }
  }
}

