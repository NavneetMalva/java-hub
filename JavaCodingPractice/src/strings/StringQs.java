package strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * StringQs.java
 * Created by Navneet Malva on 09/01/26 : 22:08.
 */
public class StringQs {
  public static void main(String[] args) {

    String str = "Navneet Malva!";
    System.out.println("Count of vowels using Java8: " + countVowels(str));

    System.out.println("First half lower and second half upper case: " + firstHalfLower("HeLLOworLd"));
    System.out.println("Find distinct characters in a string: " + findDistinctChar(str));
  }

  private static List<Character> findDistinctChar(String str) {
    return str
        .toLowerCase()
        .replaceAll("[^a-zA-Z]", "")
        .chars()
        .mapToObj(c -> (char) c)
        .distinct()
        .toList();

  }

  private static String firstHalfLower(String heLLOworLd) {

    String str = "HelloWorld";
    int mid = str.length() / 2;

    String result = IntStream.range(0, str.length())
        .mapToObj(i -> i < mid ?
            Character.toLowerCase(str.charAt(i)) :
            Character.toUpperCase(str.charAt(i))
        )
        .map(String::valueOf)
        .collect(Collectors.joining());

    return result;


  }

  private static int countVowels(String str) {

    long count = str.toLowerCase()
        .chars()
        .mapToObj(c -> (char) c)
        .filter(ch -> "aeiou".indexOf(ch) != -1)
        .count();

    return (int) count;
  }
}
