package programming;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class FunctionalProgramming {

	private static final Logger logger = LoggerFactory.getLogger(FunctionalProgramming.class);
	

	public static void printAllNumbers(List<Integer> numbers) {
		numbers.stream()
		.forEach(number-> System.out.print(number+" "));
	}
	
	
	public static void printAllSum(List<Integer> numbers) {
		int totalSum = numbers.stream().reduce(0, Integer::sum);
		logger.info("total sum: " + totalSum);
	}

	public static void printEvenNumber(List<Integer> numberList) {
		numberList.stream()
		.filter(number -> number % 2 == 0)
		.forEach(number -> System.out.print(number+" "));
//		.forEach(number -> logger.info(number+" "));
	}

	private static void squaredEvenNumbersLambdaFunctional(List<Integer> numbers) {

		numbers.stream()
		.filter(number -> number % 2 == 0) // Lambda Function
		.map(number -> number * number)
		.forEach(number -> System.out.print(number+" ")); // Method Reference

	}

	public static void main(String[] args) {

		List<Integer> numList = List.of(10, 15, 25, 6, 12, 13);
		logger.info("*** printing all numbers *** ");
		printAllNumbers(numList);
		logger.info("*** printing Total sum *** ");
		printAllSum(numList);
		logger.info("*** printing Even Numbers only ***");
		printEvenNumber(numList);
		logger.info("*** printing Sqaured of Even Numbers only *** ");
		squaredEvenNumbersLambdaFunctional(numList);
	}

}
