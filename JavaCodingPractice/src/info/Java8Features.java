package info;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Java8Features {

  public static void main(String[] args) {
    // =========================
    // 1. Lambda Expressions
    // =========================
    Runnable task = () -> System.out.println("Hello from Lambda Runnable!");
    task.run();

    // =========================
    // 2. Functional Interfaces (java.util.function package)
    // =========================
    Predicate<String> isLongerThan5 = s -> s.length() > 5;
    System.out.println("Is 'Java8' longer than 5? " + isLongerThan5.test("Java8"));

    Function<String, Integer> strLength = s -> s.length();
    System.out.println("Length of 'Lambda' = " + strLength.apply("Lambda"));

    Consumer<String> printer = s -> System.out.println("Printing: " + s);
    printer.accept("Hello Consumer!");

    Supplier<Double> randomSupplier = () -> Math.random();
    System.out.println("Random Number: " + randomSupplier.get());

    // =========================
    // 3. Streams API
    // =========================
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

    // Filter + Map + Collect
    List<String> result = names.stream()
        .filter(name -> name.startsWith("A") || name.startsWith("C")) // keep only names with A or C
        .map(String::toUpperCase) // convert to uppercase
        .toList();

    System.out.println("Filtered & Uppercase Names: " + result);

    // Reduce
    int sum = Arrays.asList(1, 2, 3, 4, 5).stream()
        .reduce(0, Integer::sum);
    System.out.println("Sum using reduce: " + sum);

    // =========================
    // 4. Method References
    // =========================
    names.forEach(System.out::println); // instead of s -> System.out.println(s)

    // =========================
    // 5. Default Methods in Interfaces
    // =========================
    Vehicle car = new Car();
    car.start();
    car.horn(); // default method from Vehicle

    // =========================
    // 6. Optional (to avoid NullPointerException)
    // =========================
    Optional<String> optionalName = Optional.of("John");
    System.out.println("Optional value: " + optionalName.orElse("Default"));

    Optional<String> emptyOpt = Optional.empty();
    System.out.println("Empty Optional with default: " + emptyOpt.orElse("Default Value"));

    // =========================
    // 7. New Date & Time API (java.time)
    // =========================
    LocalDate today = LocalDate.now();
    LocalDate tomorrow = today.plusDays(1);
    LocalDate customDate = LocalDate.of(2025, 1, 1);

    System.out.println("Today: " + today);
    System.out.println("Tomorrow: " + tomorrow);
    System.out.println("Custom Date: " + customDate);

    LocalDateTime now = LocalDateTime.now();
    System.out.println("Current DateTime: " + now);

    // =========================
    // 8. Parallel Streams
    // =========================
    int sumParallel = IntStream.rangeClosed(1, 1000)
        .parallel() // process in parallel threads
        .sum();
    System.out.println("Sum with parallel stream: " + sumParallel);
  }
}

// Interface demonstrating default and static methods
interface Vehicle {
  void start();

  // Default method
  default void horn() {
    System.out.println("Beep! Beep!");
  }

  // Static method in interface
  static void service() {
    System.out.println("Vehicle is being serviced!");
  }
}

// Class implementing Vehicle
class Car implements Vehicle {
  @Override
  public void start() {
    System.out.println("Car started!");
  }
}
