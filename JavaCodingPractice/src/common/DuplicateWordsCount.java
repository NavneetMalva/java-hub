package common;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateWordsCount {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine().toLowerCase();
		scan.close();
		String[] words = str.split(" ");

		Map<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if (hm.containsKey(words[i])) {
				hm.put(words[i], hm.get(words[i]) + 1);
			} else {
				hm.put(words[i], 1);
			}
		}

		for (Entry<String, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}

	}

}
