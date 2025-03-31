package collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx01 {

  public static void main(String[] args) {

    List<Integer> list1 = List.of(1, 3, 2, 4, 8, 9, 0, 1, 0, 2);
    List<Integer> list2 = Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5);

    Set<Integer> set1 = new HashSet<>();
    set1.addAll(
        list1); // populate the set with the list items, It will remove the duplicate elements

    Set<Integer> set2 = new HashSet<Integer>(
        list2); // Passing list2 directly to make a set of this.
    System.out.println("set1: " + set1);
    System.out.println("set2: " + set2);

    // To find union of two sets
    Set<Integer> unionSet = new HashSet<>(set1);
    unionSet.addAll(set2);
    System.out.println("unionSet: " + unionSet);

    // To find the intersection of two sets
    Set<Integer> intersectionSet = new HashSet<>(set1);
    intersectionSet.retainAll(set2);
    System.out.println("intersectionSet: " + intersectionSet);

    // To find the symmetric difference
    Set<Integer> diffSet = new HashSet<Integer>(set1);
    diffSet.removeAll(set2);
    System.out.println("diffSet: " + diffSet);

    /*
     * output set1: [0, 1, 2, 3, 4, 8, 9]
     * set2: [0, 1, 3, 4, 5, 7]
     * unionSet: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * intersectionSet: [0, 1, 3, 4]
     * diffSet: [2, 8, 9]
     */

    Set<String> hs = new HashSet<String>();
    // Custom input elements
    hs.add("A");
    hs.add("B");
    hs.add("C");
    hs.add("B");
    hs.add("D");
    hs.add("E");
    hs.remove("B");
    System.out.println(hs);

    for (String s : hs) {
      System.out.print(s + " ");
    }
    System.out.println();


  }

}
