package collections.map;

import java.util.*;

public class MapEx02CountOccurrence {

  public static void main(String[] args) {

    int[] a = {1, 13, 4, 1, 41, 31, 31, 4, 13, 2};
    ArrayList<Integer> list = new ArrayList<>();
    for (int i : a) {
      list.add(i);
    }
    System.out.println(list);

    List<Integer> listOfArray = Arrays.stream(a)  // Convert int[] to IntStream
        .boxed()    // Convert IntStream to Stream<Integer>
        .toList(); // Collect as List<Integer>
    System.out.println("listOfArray : " + listOfArray);

    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < list.size(); i++) {
      hm.putIfAbsent(list.get(i), Collections.frequency(list, list.get(i)));
    }
    System.out.println("Frequency of each elements is : " + hm);


  }
}
