package info;

import java.util.Comparator;
import java.util.List;

public class FunctionalProgQ {

  public static void main(String[] args) {

    List<Person> persons = List.of(
        new Person("Rick", "Smith", 3),
        new Person("Morty", "Sanchez", 2),
        new Person("Morty", "Anderson", 9),
        new Person("Summer", "Wick", 1),
        new Person("John", "Cena", 1),
        new Person("Rick", "Roll", 2)
    );


    System.out.println(persons.stream()
        .filter(person -> person.getExp() > 1)
        .sorted(Comparator.comparing(Person::getExp).reversed() // sort by exp descending
            .thenComparing(Person::getfName)
            .thenComparing(Person::getlName))
        .toList());
  }
}


class Person {

  private String fName, lName;
  private int exp;

  public Person(String fName, String lName, int exp) {
    this.fName = fName;
    this.lName = lName;
    this.exp = exp;
  }

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getlName() {
    return lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public int getExp() {
    return exp;
  }

  public void setExp(int exp) {
    this.exp = exp;
  }

  @Override
  public String toString() {
    return "Person{" + "fName='" + fName + '\'' + ", lName='" + lName + '\'' + ", exp=" + exp + '}';
  }
}