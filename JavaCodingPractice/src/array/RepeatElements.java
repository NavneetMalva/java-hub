package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatElements {

  public static void main(String[] args) {

    Integer[] array = {1, 2, 3, 4, 5, 6, 3, 2, 7, 8, 9, 1, 9, 9};
    List<Integer> list = List.of(array);

    findDuplicates(list);

    Map<Integer, Integer> map = new HashMap<>();

    for (int e : list) {
      map.put(e, map.getOrDefault(e, 0) + 1);
    }
    System.out.println("complete map :" + map);

    List<Integer> res = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        res.add(entry.getKey());
      }
    }
    System.out.println("result: " + res);
  }

  private static void findDuplicates(List<Integer> list) {

    List<Integer> result = list.stream()
        .collect(Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
        )).entrySet().stream()
        .filter(e -> e.getValue() > 1)
        .map(Map.Entry::getKey)
        .toList();
    System.out.println("duplicate elements result from streams: " + result);

  }
}
