package programming;

import java.util.List;

public class FP01Exercise {

	public static void main(String[] args) {
		List<Integer> numList = List.of(12, 9, 13, 14, 99, 23, 31);
		List<String> courses = List.of("spring","aks","aws","spring boot","microservices","docker","azure","pcf");
		
		
		printOddNumbersLambdaFunctional(numList);
		System.out.println("--------");
		
		courses.stream().forEach(System.out::println);
		System.out.println("--------");
		
		courses.stream()
		.filter(course -> course.contains("spring"))
		.forEach(System.out::println);;
		System.out.println("--------");
		
		courses.stream()
		.filter(course -> course.length()>=4)
		.forEach(System.out::println);
		System.out.println("--------");
		
		squaredEvenNumbersLambdaFunctional(numList);
		System.out.println("--------");
		
		cubedOddNumbersLambdaFunctional(numList);
		System.out.println("--------");		
		
		coursesLength(courses);
		
		System.out.println("--------");		
		int totalSum=numList.stream()
		.reduce(0,Integer::sum);
		System.out.println("totalsum "+ totalSum);
		


		
		
	}

	private static void printOddNumbersLambdaFunctional(List<Integer> numbers) {

		numbers.stream()
			.filter(number -> number % 2 == 1) // Lambda Function
			.forEach(System.out::println); // Method Reference

	}
	
	private static void squaredEvenNumbersLambdaFunctional(List<Integer> numbers) {

		numbers.stream()
			.filter(number -> number % 2 == 0) // Lambda Function
			.map(number -> number * number)
			.forEach(System.out::println); // Method Reference

	}
	
	private static void cubedOddNumbersLambdaFunctional(List<Integer> numbers) {

		numbers.stream()
			.filter(number -> number % 2 == 1) // Lambda Function
			.map(number -> Math.pow(number, 3))
			.forEach(System.out::println); // Method Reference

	}
	
	private static void coursesLength(List<String> courses) {

		courses.stream()
		.map(course -> course + " - " +course.length())
		.forEach(System.out::println);

	}
	
	
	
}
