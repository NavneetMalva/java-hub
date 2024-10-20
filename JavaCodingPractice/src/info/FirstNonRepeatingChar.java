package info;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String input = "Vivek";

        char result = firstNonRepeatingChar(input);
        if (result != 0)
            System.out.println("first non-repeating character of the string is : " + result);
        else
            System.out.println("No repeating char found");

    }

    private static char firstNonRepeatingChar(String input) {
        input = input.toLowerCase();

        // LinkedHashMap to store character counts while preserving insertion order
        Map<Character, Integer> mp = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return 0; // Return null character if no non-repeating character is found

    }

}
