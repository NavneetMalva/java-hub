package common;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateCharactersCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine().toLowerCase();
		scan.close();

		Map<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}

		}

		// Print only characters with a count greater than 1 (duplicates)
		for (Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}

	}

}
