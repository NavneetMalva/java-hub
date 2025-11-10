package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class PracticeInterviewProblems {
  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();
    map.put("A", 20);
    map.put("B", 5);
    map.put("Z", 90);
    map.put("Q", 15);
    System.out.println("original map:" + map);

    // sort the map based on the values using Java 8
    sortMapValues(map);

    // find the list of elements from a list using Java 8
    List<Integer> list = List.of(1, 2, 3, 4, 5, 2, 6, 1, 6, 7, 9, 10, 3);
    findDuplicates(list);


  }

  private static void sortMapValues(Map<String, Integer> map) {
    LinkedHashMap<String, Integer> resultMap = map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(
            Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    System.out.println(resultMap);
  }

  private static void findDuplicates(List<Integer> list) {

    Map<Integer, Long> map = list.stream()
        .collect(Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
        ));

    System.out.println(map);

    List<Integer> result = map.entrySet().stream()
        .filter(e -> e.getValue() > 1)
        .map(e -> e.getKey())
        .toList();

    System.out.println("result of findDuplicates: " + result);
  }
}
