package common;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateCharactersCount {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str = scan.nextLine().toLowerCase();
    scan.close();

    Map<Character, Integer> hm = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      char key = str.charAt(i);
      if (hm.containsKey(key)) {
        hm.put(key, hm.get(key) + 1);
      } else {
        hm.put(key, 1);
      }
    }

    // 2. another approach
    Map<Character, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char key = str.charAt(i);
      hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
    }
    System.out.println(hashMap);

    // Print only characters with a count greater than 1 (duplicates)
    for (Entry<Character, Integer> entry : hashMap.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
      }
    }

  }

}
