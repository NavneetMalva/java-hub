package interview;

/**
 * GroupAnagrams.java
 * Created by Navneet Malva on 23/01/26 : 23:54.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {

  public static void main(String[] args) {

    String[] input = {"eat", "tap", "cat", "tea", "act", "pat", "ate"};

    List<List<String>> result =
        new ArrayList<>(Arrays.stream(input)
            .collect(Collectors.groupingBy(
                word -> {
                  char[] chars = word.toCharArray();
                  Arrays.sort(chars);
                  return new String(chars);
                }
            ))
            .values());

    System.out.println(result);
  }
}
