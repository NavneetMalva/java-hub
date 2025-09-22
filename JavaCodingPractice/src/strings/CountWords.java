package strings;

import java.util.Arrays;
import java.util.Scanner;

public class CountWords {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String str = scan.nextLine();
    scan.close();
    System.out.println(countWords(str));

  }

  public static long countWords(String str) {
    String[] splitStr = str.split("[ ,]+"); //To split by one or more spaces or commas
    System.out.println(Arrays.toString(splitStr));
    //return splitStr.length;
    return Arrays.stream(splitStr)
        .filter(s -> !s.isEmpty())
        .count();
  }

}
