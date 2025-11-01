package interview.infosys;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapSoln {

  public static void main(String[] args) {
    ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

    for (int i = 1; i <= 5; i++) {
      map.put(i, "value-" + i);
    }

    for (Map.Entry<Integer, String> e : map.entrySet()) {
      System.out.println(e.getKey() + ":" + e.getValue());

      if (e.getKey() == 2) {
        map.put(2, "value-2 Updated"); // Safe modification in ConcurrentHashMap
      }
    }
    System.out.println("final map ; " + map);

  }

}
