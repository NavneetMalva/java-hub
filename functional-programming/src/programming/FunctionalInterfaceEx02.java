package programming;

import java.util.List;
import java.util.stream.IntStream;

public class FunctionalInterfaceEx02 {

	@FunctionalInterface
	interface Adder {
		int add(int a, int b);
	}

	@FunctionalInterface
	interface StringAdder {
		String add(String str);
	}

	public static void main(String[] args) {

		List<Integer> numList = List.of(15, 7, 4, 6, 2, 10);

		Adder adder = (a, b) -> (a + b);
		System.out.println(adder.add(5, 2)); // 7 with FunctionalInterface

		List<Integer> numbers = List.of(5, 2);
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("sum: " + sum); // 7 without functionalInterface

		StringAdder stringAdder = (str) -> "Hello" + str;
		System.out.println(stringAdder.add(", World"));

		int TotalSum = numList.stream().reduce(0, Integer::sum);
		System.out.println("TotalSum: " + TotalSum);

		IntStream.range(0, numList.size() - 1).mapToObj(i -> numList.get(i) + numList.get(i + 1))
				.forEach(number -> System.out.print(number + " ")); // 22 11 10 8 12

	}

}
