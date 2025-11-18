package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * FindFirstRepeatedCharJava8.java
 * Created by Navneet Malva on 11/11/25 : 21:36.
 */
public class FindFirstRepeatedCharJava8 {

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>(Arrays.asList(13, 5, 27, 8, 42, 19, 33, 7, 21));
    List<String> words = new ArrayList<>(Arrays.asList("apple", "zebra", "java", "boot", "spring"));

    String str = "Java stream API is very good concept.";
    run(str);
  }

  private static void run(String str) {
    System.out.println(

        str.toLowerCase().chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()
            )).entrySet().stream()
            .filter(e -> e.getValue() > 2)
            .findFirst()
            .get()
            .getKey()

    );
  }
}
