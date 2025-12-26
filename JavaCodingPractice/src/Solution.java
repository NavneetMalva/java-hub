import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

  public static int countSubstrings() {
    // Write your code here.
    String s = "codestudio";
    List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
    int count = 0;
    char[] letters = s.toCharArray();
    for (char letter : letters) {
      if (vowels.contains(letter)) {
        count++;
      }
    }
    return count;
  }

  public static char highestOccuringChar(String str) {
    //Your code goes here
    LinkedHashMap<Character, Integer> hs = new LinkedHashMap<>();

    for (char c : str.toCharArray()) {
      hs.put(c, hs.getOrDefault(c, 0) + 1);
    }

    int maxValueInMap = (Collections.max(hs.values()));
    for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
      if (entry.getValue() == maxValueInMap) {
        return entry.getKey();
      }

    }

    return 0;
  }

  public static String removeConsecutiveDuplicates(String s) {
    // Write your code here

    LinkedHashSet<Character> hs = new LinkedHashSet<>();
    for (char c : s.toCharArray()) {
      hs.add(c);
    }

    String substring = s.substring(1, 2);
    Iterator<Character> itr = hs.iterator();
    StringBuilder str = new StringBuilder();
    while (itr.hasNext()) {
      str.append(itr.next());
    }
    return str.toString();

  }

  public static String reverseOnlyLetters(String s) {
    // Write your code here.

    char[] arr = s.toCharArray();
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      while (left < right && !Character.isLetter(arr[left])) {
        left++;
      }
      while (left < right && !Character.isLetter(arr[right])) {
        right--;
      }
      if (left < right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }
    return new String(arr);
  }

  public static int maxPerimeterTriangle(ArrayList<Integer> arr, int n) {
    // Write your code here.
    if (n < 3)
      return 0;

    arr.sort(Collections.reverseOrder());
    System.out.println("list in reverse: " + arr);

    //Object[] nums = arr.toArray();
    for (int i = 0; i < n - 2; i++) {
      Integer a = arr.get(i);
      Integer b = arr.get(i + 1);
      Integer c = arr.get(i + 2);
      if (a < b + c) {
        return a + b + c;
      }
    }
    return 0;

  }

  public static Boolean alienDictonary(int n, String words[], String order) {
    // Write your code here..

    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < order.length(); i++)
      map.put(order.charAt(i), i);

    for (int i = 0; i < words.length - 1; i++) {
      String s1 = words[i];
      String s2 = words[i + 1];
      int len = Math.min(s1.length(), s2.length());

      for (int j = 0; j < len; j++) {
        if (s1.charAt(j) != s2.charAt(j)) {
          if (map.get(s1.charAt(j)) > map.get(s2.charAt(j))) {
            return false;
          }
          break;
        }
      }

      if (s1.length() > s2.length()) {
        return false;
      }

    }
    return true;
  }

  public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
    // Write your code here.

    List<Integer> l = new ArrayList<>();

    for (int i : arr1) {
      if (i == 0) continue;
      l.add(i);
    }

    for (int i : arr2) {
      if (i == 0) continue;
      l.add(i);
    }

    Collections.sort(l);
    return l.stream().mapToInt(Integer::intValue).toArray();
  }

  public static int lengthOfLongestSubstring(String s) {

    if (s.isEmpty())
      return 0;

    int maxLen = 0;
    for (int i = 0; i < s.length(); i++) {
      int count = 1;
      for (int j = 1; j < s.length(); j++) {
        if (s.charAt(i) != s.charAt(j)) {
          count++;
        } else {
          break;
        }
      }
      maxLen = Math.max(count, maxLen);
    }
    return maxLen;

  }

  public static int countUniqueEmails(String[] emails) {
    // Write your code here

    HashSet<String> set = new HashSet<>();

    for (String str : emails) {
      String name = str.split("@")[0].split("\\+")[0].replace(".", "");
      String domain = str.split("@")[1];
      set.add(name + domain);
    }
    return set.size();

  }

  public static void main(String[] args) {
    //char res = highestOccuringChar("aabbb");
    //System.out.println(res);
    //
    //System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    //ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 7, 1, 5));
    //System.out.println(maxPerimeterTriangle(arr, 4));

    //System.out.println(lengthOfLongestSubstring("pwwkew"));

    System.out.println(countUniqueEmails(new String[]{"test.email+alex@ninjas.com", "test.email.goo+ciao@ninjas.com", "nav@gmail.com"}));


    String str = "swiss";

    Map<Character, Long> map
        = str.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(
            Function.identity(),
            Collectors.counting())
        );

    System.out.println(map);

  }

}