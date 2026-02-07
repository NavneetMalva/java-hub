package interview.firstcitizens;

/**
 * PersonJava8.java
 * Created by Navneet Malva on 06/02/26 : 11:47.
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class PersonJava8 {

  public static void main(String[] args) {

    List<Person> people = Arrays.asList(
        new Person("Alice", LocalDate.of(1990, 5, 15), "New York"),
        new Person("Bob", LocalDate.of(1985, 10, 20), "London"),
        new Person("Charlie", LocalDate.of(1992, 3, 25), "New York"),
        new Person("David", LocalDate.of(1988, 7, 10), "Paris"),
        new Person("Eve", LocalDate.of(1995, 1, 30), "London"),
        new Person("Frank", LocalDate.of(1980, 12, 5), "New York")
    );

    // =========================
    // 1. Age > 30 and sort by name
    // =========================
    List<Person> filtered = people.stream()
        .filter(p -> Period.between(p.getBirthDay(), LocalDate.now()).getYears() > 30)
        .sorted(Comparator.comparing(Person::getName))
        .collect(Collectors.toList());

    System.out.println("Age > 30 sorted:");
    filtered.forEach(System.out::println);


    // =========================
    // 2. Group by city and count
    // =========================
    Map<String, Long> countByCity = people.stream()
        .collect(Collectors.groupingBy(
            Person::getCity,
            Collectors.counting()
        ));

    System.out.println("\nCount by city:");
    System.out.println(countByCity);


    // =========================
    // 3. Oldest person in each city
    // =========================
    Map<String, Optional<Person>> oldestByCity = people.stream()
        .collect(Collectors.groupingBy(
            Person::getCity,
            Collectors.minBy(Comparator.comparing(Person::getBirthDay))
        ));

    System.out.println("\nOldest per city:");
    oldestByCity.forEach((city, person) ->
        System.out.println(city + " -> " + person.orElse(null)));
  }
}


class Person {

  private String name;
  private LocalDate birthDay;
  private String city;

  public Person(String name, LocalDate birthDay, String city) {
    this.name = name;
    this.birthDay = birthDay;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public LocalDate getBirthDay() {
    return birthDay;
  }

  public String getCity() {
    return city;
  }

  public String toString() {
    return name + " (" + birthDay + ", " + city + ")";
  }
}

