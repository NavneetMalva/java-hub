package interview.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * CodingProblem.java
 * Created by Navneet Malva on 29/12/25 : 14:13.
 * <p>
 * Q1: using Streams to group fruits by their starting character.
 * Q2: find the sum of the all the previous elements of
 */

public class CodingProblem {

  public static void main(String[] args) {

    List<String> fruits = Arrays.asList("Apple", "Apricot", "Banana", "Blueberry", "Cherry", "Avocado");
    groupElementsUsingStartingChar(fruits);

    List<Integer> input = Arrays.asList(10, 20, 30, 40);
    sumOfPreviousElements(input);

  }

  private static void sumOfPreviousElements(List<Integer> input) {
    List<Integer> result = new ArrayList<>();

    int sum = 0;

    for (Integer curr : input) {
      sum += curr;
      result.add(sum);
    }
    System.out.println(result);
  }

  private static void groupElementsUsingStartingChar(List<String> fruits) {
    System.out.println(
        fruits.stream()
            .collect(Collectors.groupingBy(w -> w.charAt(0)))
    );
  }
}
