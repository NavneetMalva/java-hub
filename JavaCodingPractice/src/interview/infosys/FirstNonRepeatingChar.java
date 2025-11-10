package interview.infosys;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

  public static void main(String[] args) {

    String input = "pineapple";

    char result = firstNonRepeatingChar(input);
    if (result != 0) {
      System.out.println("first non-repeating character of the string is : " + result);
    } else {
      System.out.println("No repeating char found");
    }

    char result2 = firstNonRepeatingChar2(input);
    System.out.println("first non-repeating character of the string is : " + result2);

    char result3 = firstNonRepeatingCharUsingStream(input);
    System.out.println("first non-repeating character of the string is using stream : " + result3);

  }

  private static char firstNonRepeatingChar(String input) {
    input = input.toLowerCase();

    // LinkedHashMap to store character counts while preserving insertion order
    Map<Character, Integer> mp = new LinkedHashMap<>();

    for (char c : input.toCharArray()) {
      mp.put(c, mp.getOrDefault(c, 0) + 1);
    }

    for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }
    return 0; // Return null character if no non-repeating character is found

  }

  // another approach
  private static char firstNonRepeatingChar2(String input) {
    input = input.toLowerCase();
    Map<Character, Integer> mp = new LinkedHashMap<>();

    for (char c : input.toCharArray()) {
      if (mp.containsKey(c)) {
        mp.put(c, mp.get(c) + 1);
      } else {
        mp.put(c, 1);
      }
    }
    for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }
    return 0;
  }

  private static char firstNonRepeatingCharUsingStream(String input) {


    Map<Character, Long> map = input.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(
            Function.identity(),
            LinkedHashMap::new,
            Collectors.counting())
        );

    Character first = map.entrySet().stream()
        .filter(entry -> entry.getValue() == 1)
        .findFirst()
        .map(Map.Entry::getKey)
        .orElse('0');

    return first;


  }

}
