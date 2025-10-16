package cognizant;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharactersJava8 {
  public static void main(String[] args) {
    String input = "hello world";

    // Count occurrences using Java 8 Streams
    Map<Character, Long> charCountMap = input.chars()               // IntStream of chars
        .peek(s -> System.out.print(s + " "))
        .mapToObj(c -> (char) c)                                // Convert int to Character
        .peek(s -> System.out.print(s + " "))
        .filter(c -> c != ' ')                                  // Optional: ignore spaces
        .collect(Collectors.groupingBy(Function.identity(),     // Group by char
            Collectors.counting()));                        // Count occurrences

    // Print result
    System.out.println("\nprinting results");
    charCountMap.forEach((k, v) -> System.out.println(k + " : " + v));
  }
}
