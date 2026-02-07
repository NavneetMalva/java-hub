package interview;

/**
 * GroupCharAndCount.java
 * Created by Navneet Malva on 07/02/26 : 18:51.
 */
public class GroupCharAndCount {
  public static void main(String[] args) {

    String str = "aaabbcccdaa";

    calculateCount(str);

  }

  private static void calculateCount(String str) {
    int count = 1;
    StringBuilder result = new StringBuilder();
    for (int i = 1; i < str.length(); i++) {

      if (str.charAt(i) == str.charAt(i - 1)) {
        count++;
      } else {
        result.append(str.charAt(i - 1)).append(count);
        count = 1;
      }
    }
    // add last group
    result.append(str.charAt(str.length() - 1)).append(count);
    System.out.println(result);
  }
}
