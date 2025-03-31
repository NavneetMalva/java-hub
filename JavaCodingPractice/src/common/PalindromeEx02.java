package common;

import java.util.Scanner;

public class PalindromeEx02 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = scan.nextLine();
    scan.close();

    if (isPalindrome(str)) {
      System.out.println(str + " is a palindrome.");
    } else {
      System.out.println(str + " is not a palindrome.");
    }

  }

  public static boolean isPalindrome(String str) {
    int i = 0;
    int j = str.length() - 1;
    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

}
