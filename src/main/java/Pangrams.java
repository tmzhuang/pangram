import java.util.*;

class Pangrams {
  private static final int ALPHABET_SIZE = 26;

  public static boolean isPangram(String sentence) {
    Map<Character, Character> foundLetters = new HashMap<Character, Character>();
    sentence = normalizeSentence(sentence);
    char[] letters = sentence.toCharArray();

    for(char c: letters) {
      foundLetters.put(c, c);
    }

    return foundLetters.size() == ALPHABET_SIZE;
  }

  private static String normalizeSentence(String sentence) {
    return sentence.toLowerCase().replaceAll("[^a-z]", "");
  }
}
