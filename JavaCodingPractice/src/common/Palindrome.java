package common;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		String original = scan.nextLine();
		scan.close();

		if (isPalindrome(original)) {
			System.out.println("Entered string is a palindrome.");
		} else {
			System.out.println("Entered string isn't a palindrome.");
		}

	}

	public static boolean isPalindrome(String original) {
		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		return original.equals(reverse);

	}

}
