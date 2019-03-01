package com.tedmyoung.lambastreams;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This set of exercises is about lambdas and method references.
 * You will write a lambda or method reference corresponding to
 * each of several different functional interfaces.
 */
public class A_Lambdas {

  // word list to be used in examples
  static List<String> wordList = Arrays.asList(
      "every", "problem", "in", "computer", "science",
      "can", "be", "solved", "by", "adding", "another",
      "level", "of", "indirection");

  static List<String> sonnet = Arrays.asList(
      "From fairest creatures we desire increase,"
      , "That thereby beauty's rose might never die,"
      , "But as the riper should by time decease,"
      , "His tender heir might bear his memory:"
      , "But thou contracted to thine own bright eyes,"
      , "Feed'st thy light's flame with self-substantial fuel,"
      , "Making a famine where abundance lies,"
      , "Thy self thy foe, to thy sweet self too cruel:"
      , "Thou that art now the world's fresh ornament,"
      , "And only herald to the gaudy spring,"
      , "Within thine own bud buriest thy content,"
      , "And, tender churl, mak'st waste in niggarding:"
      , "Pity the world, or else this glutton be,"
      , "To eat the world's due, by the grave and thee.");


  static final String REGEXP = "\\W+"; // for splitting String into words

// Exercise 1: Print out all the words in wordList, which is
// a static List<String>.

  @Test
  @Ignore
  public void printAllWords() {
    /* TODO */

    // no assertions needed, just print them all
  }

// Exercise 2: Convert all words in wordList to upper case,
// and gather the result into an output list.

  @Test
  @Ignore
  public void upperCaseWords() {
    List<String> output = null; /* TODO */

    assertThat(output)
        .isEqualTo(
            Arrays.asList(
                "EVERY", "PROBLEM", "IN", "COMPUTER", "SCIENCE",
                "CAN", "BE", "SOLVED", "BY", "ADDING", "ANOTHER",
                "LEVEL", "OF", "INDIRECTION"));
  }

// Exercise 3: Find all the words in wordList that have even length
// and put them into an output list.

  @Test
  @Ignore
  public void findEvenLengthWords() {
    List<String> output = null; /* TODO */

    assertThat(output)
        .isEqualTo(Arrays.asList(
            "in", "computer", "be", "solved", "by", "adding", "of"));
  }


// Exercise 4: Create a list containing the words, lower-cased, in alphabetical order.

  @Test
  @Ignore
  public void sortedLowerCase() throws IOException {
    List<String> output = null; /* TODO */


    assertThat(output)
        .isEqualTo(Arrays.asList(
            "adding", "another", "be", "by", "can", "computer", "every", "in",
            "indirection", "level", "of", "problem", "science", "solved"));
  }

// Exercise 5: Sort unique, lower-cased words by length, then alphabetically
// within length, and place the result into an output list.

  @Test
  @Ignore
  public void sortedLowerCaseDistinctByLengthThenAlphabetically() throws IOException {
    List<String> output = null; /* TODO */

    assertThat(output)
        .isEqualTo(Arrays.asList(
            "a", "s", "as", "be", "by", "in", "or", "st", "to", "we",
            "and", "art", "bud", "but", "die", "due", "eat", "foe", "his",
            "mak", "now", "own", "the", "thy", "too", "bear", "else",
            "eyes", "feed", "from", "fuel", "heir", "lies", "only",
            "pity", "rose", "self", "that", "thee", "this", "thou",
            "time", "with", "churl", "cruel", "flame", "fresh", "gaudy",
            "grave", "light", "might", "never", "riper", "sweet", "thine",
            "waste", "where", "world", "beauty", "bright", "desire",
            "famine", "herald", "making", "memory", "should", "spring",
            "tender", "within", "buriest", "content", "decease",
            "fairest", "glutton", "thereby", "increase", "ornament",
            "abundance", "creatures", "contracted", "niggarding",
            "substantial"));
  }

}
