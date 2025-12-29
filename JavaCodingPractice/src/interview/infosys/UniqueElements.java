package interview.infosys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElements {

  public static void main(String[] args) {

    int[] arr = {1, 2, 5, 4, 3, 2, 8, 1, 22, 4};

    uniqueElementsUsingJava8(arr);
    Map<Integer, Integer> mp = new HashMap<>();

    //for (int e : arr) {
    //  if (mp.containsKey(e)) {
    //    mp.put(e, mp.get(e) + 1);
    //  } else {
    //    mp.put(e, 1);
    //  }
    //}

    for (int e : arr) {
      mp.put(e, mp.getOrDefault(e, 0) + 1);
    }

    List<Integer> list = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
      if (entry.getValue() == 1) {
        list.add(entry.getKey());
      }
    }

    System.out.println("Unique elements which are not repeated in arr :" + list);


  }

  private static void uniqueElementsUsingJava8(int[] arr) {

    List<Integer> list = Arrays.stream(arr)
        .boxed()
        .collect(Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
        )).entrySet().stream()
        .filter(e -> e.getValue() == 1)
        .map(Map.Entry::getKey)// to get the keys only
        .toList();
    System.out.println("collect: " + list);
  }
}
