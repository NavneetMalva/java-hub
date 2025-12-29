package interview.infosys;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringConcat {

  public static void main(String[] args) {

    String str = "This     is  a     Example   class         To Test.";
    String[] strings = str.split(" ");
    StringBuilder newStr = new StringBuilder();

    for (String s : strings) {
      newStr.append(s);
    }
    System.out.println(newStr);

    concatUsingJava8(str);

  }

  private static void concatUsingJava8(String str) {

    System.out.println(Arrays.stream(str.split(" "))
        .collect(Collectors.joining()));
  }
}

class StringConcatenationAnother {

  public static void main(String[] args) {
    String str = "This     is  a     Example   class         To Test.";
    StringBuilder result = new StringBuilder();

    for (char ch : str.toCharArray()) {
      if (Character.isLetter(ch)) {
        result.append(ch);
      }
    }
    System.out.println(result);

  }
}
