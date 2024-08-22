package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		List<Integer> numList = List.of(12, 9, 13, 14, 99, 23, 31);
		printAllNumbers(numList);
		System.out.println("-----------");
		printEvenNumbers(numList);
	}

	private static void printAllNumbers(List<Integer> numbers) {
		for (int num : numbers)
			System.out.println(num);
	}

	private static void printEvenNumbers(List<Integer> numbers) {
		for (int num : numbers) {
			if (num % 2 == 0)
				System.out.println(num);
		}
	}

}
