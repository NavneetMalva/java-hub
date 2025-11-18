package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * DuplicatesElements.java
 * Created by Navneet Malva on 12/11/25 : 00:38.
 */
public class DuplicatesElements {

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>(Arrays.asList(13, 5, 27, 8, 42, 19, 33, 7, 21, 5, 7));

    List<Character> words = new ArrayList<>(Arrays.asList('a', 'b', 'a', 'c', 'd', 'b'));

    run(numbers, words);
  }

  private static void run(List<Integer> numbers, List<Character> words) {
    System.out.println("Original numbers: " + numbers);

    System.out.println(
        numbers.stream()
            .collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            )).entrySet().stream()
            .filter(entry -> entry.getValue() > 1)
            .map(Map.Entry::getKey)
            .toList()
    );

    System.out.println("Original words: " + words);
    System.out.println(
        words.stream()
            .collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            )).entrySet().stream()
            .filter(entry -> entry.getValue() > 1)
            .map(Map.Entry::getKey)
            .toList()
    );
  }
}
