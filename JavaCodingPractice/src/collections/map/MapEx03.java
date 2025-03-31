package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEx03 {

  public static void main(String[] args) {

    Map<Integer, String> hm = new HashMap<>();
    hm.put(1, "Red");
    hm.put(2, "Green");
    hm.put(3, "Black");
    hm.put(4, "White");
    hm.put(5, "Blue");

    System.out.println(hm.size());
    System.out.println(hm.containsKey(3));
    System.out.println(hm.containsValue("Orange"));

    // Removing all the elements from the linked map
    // hm.clear();

    System.out.println(hm.isEmpty());

    System.out.println("hm: " + hm);

    // Set view of the mappings
    System.out.println("set view: " + hm.entrySet());

    // get the key set
    System.out.println("key set of the map: " + hm.keySet()); // [1, 2, 3, 4, 5]

    // get the values set
    System.out.println("values set of the map: " + hm.values()); // [Red, Green, Black, White, Blue]

    // iterate the map
    System.out.println("Iterating the hash map");
    for (Entry<Integer, String> e : hm.entrySet()) {
      System.out.println(e.getKey() + " : " + e.getValue());
    }

    // iterate the map
    System.out.println("Iterating the hash map with Another simple approach");
    for (Integer key : hm.keySet()) {
      System.out.println(key + " : " + hm.get(key));
    }

  }

}
