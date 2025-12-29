package interview.vaco;

import java.util.HashMap;
import java.util.Map;

// Longest substring without repeating characters

public class findLongestSubstring {
  public static void main(String[] args) {

    String str = "navneet";
    System.out.println(findLongestSubstringLength(str));
  }

  private static int findLongestSubstringLength(String str) {
    int maxL = 0;
    int currL = 0;

    Map<Character, Integer> seen = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (seen.containsKey(c)) {
        currL = Math.max(currL, seen.get(c) + 1);
      }
      seen.put(c, i);
      maxL = Math.max(maxL, i - currL + 1);
    }
    return maxL;
  }

}
