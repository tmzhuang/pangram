import java.util.*;

class Pangrams {
  private static final int ALPHABET_SIZE = 26;

  public static boolean isPangram(String sentence) {
    return sentence.toLowerCase()
      .replaceAll("[^a-z]", "")
      .chars()
      .distinct()
      .count() == ALPHABET_SIZE;
  }
}
