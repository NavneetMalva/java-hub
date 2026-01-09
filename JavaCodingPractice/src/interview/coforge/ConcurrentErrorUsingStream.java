package interview.coforge;

import java.util.HashMap;
import java.util.Map;

/**
 * ConcurrentErrorUsingStream.java
 * Created by Navneet Malva on 09/01/26 : 19:17.
 */
public class ConcurrentErrorUsingStream {

  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>(Map.of("CS", 1, "IT", 2, "EC", 3));

    map.entrySet()
        .stream()
        .forEach(e -> {
          if (e.getKey().equals("IT")) {
            map.put("MECH", 5);
          }
        });

  }

}
