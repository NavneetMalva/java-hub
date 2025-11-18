package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * FindWords.java
 * Created by Navneet Malva on 11/11/25 : 21:53.
 * <p>
 * Find the words that starts with letter b from the string
 */

public class FindWordsJava8 {

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>(Arrays.asList(13, 5, 27, 8, 42, 19, 33, 7, 21));
    List<String> words = new ArrayList<>(Arrays.asList("apple", "zebra", "java", "boot", "spring"));

    String str = "apple banana mango box bean fox auto bike";
    char c = 'b';
    run(str, c);
  }

  private static void run(String str, char c) {
    System.out.println(

        Arrays.stream(str.replaceAll("[^a-z\\s]", "")
                .toLowerCase()
                .split(" "))
            .filter(w -> w.startsWith(String.valueOf(c)))
            .toList()

    );
  }
}
