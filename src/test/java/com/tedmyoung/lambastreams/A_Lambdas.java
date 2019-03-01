package com.tedmyoung.lambastreams;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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

// Exercise 10: Categorize the words into a map, where the map's key is
// the length of each word, and the value corresponding to a key is a
// list of words of that length. Don't bother with uniqueness or lower-
// casing the words.

  @Test
  @Ignore
  public void mapLengthToWordList() throws IOException {
    Map<Integer, List<String>> map = null; /* TODO */

    assertThat(map.get(7).size())
        .isEqualTo(6);
    assertThat(map.get(8))
        .isEqualTo(Arrays.asList("increase", "ornament"));
    assertThat(map.get(9))
        .isEqualTo(Arrays.asList("creatures", "abundance"));
    assertThat(map.get(10))
        .isEqualTo(Arrays.asList("contracted", "niggarding"));
    assertThat(map.get(11))
        .isEqualTo(Arrays.asList("substantial"));
    assertThat(map.containsKey(12))
        .isFalse();
  }

// Exercise 11: Gather the words into a map, accumulating a count of the
// number of occurrences of each word. Don't worry about upper case and
// lower case. Extra challenge: implement two solutions, one that uses
// groupingBy() and the other that uses toMap().

  @Test
  @Ignore
  public void wordFrequencies() throws IOException {
    Map<String, Long> map = null; /* TODO */

    assertThat((long) map.get("tender"))
        .isEqualTo(2L);
    assertThat((long) map.get("the"))
        .isEqualTo(6L);
    assertThat((long) map.get("churl"))
        .isEqualTo(1L);
    assertThat((long) map.get("thine"))
        .isEqualTo(2L);
    assertThat((long) map.get("world"))
        .isEqualTo(3L);
    assertThat(map.containsKey("lambda"))
        .isFalse();
  }

// Exercise 12: Create nested maps, where the outer map is a map from the
// first letter of the word to an inner map. (Use a string of length one
// as the key.) The inner map, in turn, is a mapping from the length of the
// word to a list of words with that length. Don't bother with any lowercasing
// or uniquifying of the words.
//
// For example, given the words "foo bar baz bazz" the string
// representation of the result would be:
//     {f={3=[foo]}, b={3=[bar, baz], 4=[bazz]}}.

  @Test
  @Ignore
  public void nestedMaps() throws IOException {
    Map<String, Map<Integer, List<String>>> map = null; /* TODO */

    assertThat(map.get("F").get(4).toString())
        .isEqualTo("[From, Feed]");
    assertThat(map.get("b").get(2).toString())
        .isEqualTo("[by, be, by]");
    assertThat(map.get("t").get(3).toString())
        .isEqualTo("[the, thy, thy, thy, too, the, the, thy, the, the, the]");
    assertThat(map.get("b").get(6).toString())
        .isEqualTo("[beauty, bright]");
  }

}
