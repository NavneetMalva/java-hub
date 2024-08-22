package strings;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scan.nextLine();
		scan.close();
		System.out.println(countWords(str));

	}

	public static int countWords(String str) {
		String[] splitStr = str.split(" ");
		return splitStr.length;

	}

}
