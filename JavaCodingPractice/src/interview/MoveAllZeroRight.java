package interview;

import java.util.List;
import java.util.stream.Stream;

// move all zeros to right using java 8
public class MoveAllZeroRight {
  public static void main(String[] args) {
    List<Integer> list = List.of(-1, 0, 3, -5, 0, 8, 2, 0, 9);

    List<Integer> result = Stream.concat(
        list.stream().filter(n -> n != 0),
        list.stream().filter(n -> n == 0)
    ).toList();

    System.out.println(result);

  }
}
