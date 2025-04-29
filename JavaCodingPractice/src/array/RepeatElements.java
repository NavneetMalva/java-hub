package array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatElements {

  public static void main(String[] args) {

    Integer[] array = {1, 2, 3, 4, 5, 6, 3, 2, 7, 8, 9, 1, 9, 9};
    List<Integer> list = List.of(array);

    Map<Integer, Integer> map = new HashMap<>();

    for (int e : list) {
      if (map.containsKey(e)) {
        map.put(e, map.get(e) + 1);
      } else {
        map.put(e, 1);
      }
    }
    System.out.println("complete map :" + map);

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.print("Repeated elements : " + entry.getKey() + " ");
      }
    }

  }
}
