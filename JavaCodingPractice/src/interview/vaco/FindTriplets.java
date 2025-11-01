package interview.vaco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTriplets {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(List.of(1, 4, 2, 3, 5, 6));
    System.out.println(findTriplets(list));
  }

  public static List<List<Integer>> findTriplets(List<Integer> list) {

    Set<Integer> set = new HashSet<>(list);
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        int sum = list.get(i) + list.get(j);
        if (set.contains(sum)) {
          result.add(Arrays.asList(list.get(i), list.get(j), sum));
        }
      }
    }
    return result;
  }

}
