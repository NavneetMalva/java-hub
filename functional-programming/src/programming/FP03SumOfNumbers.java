package programming;

import java.util.Arrays;
import java.util.List;

public class FP03SumOfNumbers {
	public static void main(String[] args) {
		// Create an ArrayList of ArrayLists of integers
		List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

//		numbers.forEach(System.out::println);
//		int sum = 0;
//
//		for (int num : numbers) {
//			sum += num;
//			System.out.println(sum + " ");
//		}

		System.out.println("------------------");

//		In Java, lambda expressions have access to variables from their enclosing scope. 
//		However, there is a restriction that these variables must be effectively final.
//		To work around this restriction when you need to modify a variable within a lambda expression, 
//		one common approach is to use an array or an object to hold the mutable state,

		int[] total = { 0 };

		numbers.forEach(num -> {
			total[0] += num;
			System.out.println(total[0] + " ");
		});

		System.out.println("print total variable:" + total[0]);

		total[0] = 0;
		
		System.out.println("print total variable:" + total[0]);
		numbers.forEach(num -> {
			total[0] += num;
		});
		System.out.println("total sum of all numbers" + ": " + total[0]);

	}
}
