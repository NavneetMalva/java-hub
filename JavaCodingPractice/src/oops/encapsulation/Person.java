package oops.encapsulation;

public class Person {

  private String name;
  private int age;
  private String country;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Person(String name, int age, String country) {
    super();
    this.name = name;
    this.age = age;
    this.country = country;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", country=" + country + "]";
  }

  public static void main(String[] args) {

    Person person = new Person("Nick", 26, "India");
    System.out.println(person);
  }

}
