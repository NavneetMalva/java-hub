package interview.accolite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GroupAnagrams.java
 * Created by Navneet Malva on 03/02/26 : 11:48.
 */
public class GroupAnagrams {
  public static void main(String[] args) {

    System.out.println(
        groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})
    );

  }

  public static List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String>> map = new HashMap<>();

    for (String word : strs) {
      char[] ch = word.toCharArray();
      Arrays.sort(ch);

      String key = new String(ch);

      map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);

      //simple version
      //if (!map.containsKey(key)) {
      //  map.put(key, new ArrayList<>());
      //}
      //map.get(key).add(word);

    }

    return new ArrayList<>(map.values());
  }
}
