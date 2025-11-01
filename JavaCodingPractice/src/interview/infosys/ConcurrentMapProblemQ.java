package interview.infosys;

import java.util.HashMap;
import java.util.Map;

/**
 * a ConcurrentModificationException can occur on maps without using multiple threads. This happens
 * when you modify the map while iterating over it using an iterator that does not support
 * concurrent modification.
 */

public class ConcurrentMapProblemQ {

  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();

    for (int i = 1; i <= 5; i++) {
      map.put(i, "value-" + i);
    }

    for (Map.Entry<Integer, String> e : map.entrySet()) {
      System.out.println(e.getKey() + ":" + e.getValue());

      if (e.getKey() == 2) {
        map.put(6, "value-6"); // Exception in thread "main" java.util.ConcurrentModificationException
      }

    }

  }
}

/*
 * Solution To avoid this exception, use one of the following options:
 * <p>
 * Use Iterator.remove(): This method safely removes elements during iteration.
 * Use ConcurrentHashMap: It allows concurrent modifications without throwing an exception.
 * Use Map.entrySet() Copy: Make a copy of the entry set before iteration if modification is needed.
 */
