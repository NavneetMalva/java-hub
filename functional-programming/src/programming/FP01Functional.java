package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numList = List.of(12, 9, 13, 14, 99, 23, 31);
		printAllNumbersFunctional(numList);
		System.out.println("--------");
		printEvenNumbersFunctional(numList);
		System.out.println("--------");
		printEvenNumbersLambdaFunctional(numList);
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printAllNumbersFunctional(List<Integer> numbers) {

		numbers.stream().forEach(System.out::println);

	}

	private static void printEvenNumbersFunctional(List<Integer> numbers) {

		numbers.stream()
			.filter(FP01Functional::isEven) // Method reference
			.forEach(System.out::println); // Method Reference

	}

	private static void printEvenNumbersLambdaFunctional(List<Integer> numbers) {

		numbers.stream()
			.filter(number -> number % 2 == 0) // Lambda Function
			.forEach(System.out::println); // Method Reference

	}
}
