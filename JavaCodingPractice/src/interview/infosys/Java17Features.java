package interview.infosys;

import java.util.List;
import java.util.random.RandomGenerator;

public class Java17Features {

  public static void main(String[] args) {
    // ============================
    // 1. Switch Expressions (finalized in Java 14, commonly used in 17)
    // ============================
    String day = "MON";
    int dayNumber = switch (day) {
      case "MON", "TUE", "WED", "THU", "FRI" -> 1; // multiple labels
      case "SAT", "SUN" -> 2;
      default -> throw new IllegalArgumentException("Invalid day: " + day);
    };
    System.out.println("Day number: " + dayNumber);

    // ============================
    // 2. Text Blocks (introduced in 15, very useful in 17)
    // ============================
    String json = """
        {
            "name": "Alice",
            "age": 30
        }
        """;
    System.out.println("Text Block JSON:\n" + json);

    // ============================
    // 3. Records (Java 16, still key in 17)
    // ============================
    // Records are concise data carriers (immutable by default)
    record Person(String name, int age) {
    }
    Person p = new Person("Bob", 28);
    System.out.println("Record Person: " + p.name() + ", " + p.age());

    // ============================
    // 4. Pattern Matching for instanceof (finalized in 16, in 17 too)
    // ============================
    Object obj = "Hello Java17";
    if (obj instanceof String s) { // pattern variable introduced
      System.out.println("String length: " + s.length());
    }

    // ============================
    // 5. Sealed Classes (new in Java 17)
    // ============================
    // Sealed classes restrict which classes can extend them.
    Shape shape = new Circle(5);
    System.out.println("Area: " + shape.area());

    // ============================
    // 6. NullPointerException Improvements
    // ============================
    try {
      String str = null;
      System.out.println(str.length()); // This will show detailed NPE in Java 17
    } catch (NullPointerException e) {
      System.out.println("Improved NPE message: " + e.getMessage());
    }

    // ============================
    // 7. Stream API Improvements
    // ============================
    // Example: toList() method is now part of Stream API (no need Collectors.toList())
    List<String> names = List.of("Alice", "Bob", "Charlie");
    List<String> upper = names.stream()
        .map(String::toUpperCase)
        .toList();
    System.out.println("Stream toList(): " + upper);

    // ============================
    // 8. Random Number Generator (RNG) API improvements
    // ============================
    RandomGenerator generator = RandomGenerator.of("L64X128MixRandom");
    System.out.println("Random number (Java 17 RNG): " + generator.nextInt(100));
  }
}

// ============================
// 5. Sealed Classes Example
// ============================

sealed abstract class Shape permits Circle, Rectangle {
  abstract double area();
}

final class Circle extends Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double area() {
    return Math.PI * radius * radius;
  }
}

final class Rectangle extends Shape {
  double w, h;

  Rectangle(double w, double h) {
    this.w = w;
    this.h = h;
  }

  @Override
  double area() {
    return w * h;
  }
}


