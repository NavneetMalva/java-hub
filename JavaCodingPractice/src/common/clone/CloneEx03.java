package common.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Example demonstrating deep copying using a copy constructor.
 * <p>
 * The {@code Emp4} class contains a mutable {@code Company4} object.
 * To create a deep copy of an {@code Emp4} instance, the copy constructor
 * creates a new {@code Company4} instance with the same data, ensuring
 * that changes to the copied object's company do not affect the original.
 * <p>
 * This approach avoids the complexities and pitfalls of using {@code clone()}
 * and {@code Cloneable}, providing a clear and safe way to perform deep copies.
 */

@Data
@AllArgsConstructor
class Company4 {
  private String name;
}

@Data
class Emp4 {
  private String name;
  private int age;
  private Company4 company;

  public Emp4(String name, int age, Company4 company) {
    this.name = name;
    this.age = age;
    this.company = company;
  }

  // copy constructor
  public Emp4(Emp4 emp) {
    this.name = emp.getName();
    this.age = emp.getAge();
    this.company = new Company4(emp.getCompany().getName());
  }

  public static void main(String[] args) {
    Emp4 e1 = new Emp4("Mike", 25, new Company4("Company_ABC"));
    System.out.println("Invoking copy constructor");
    Emp4 e2 = new Emp4(e1);
    e2.getCompany().setName("Company_XYZ");
    System.out.println("e1 company name : " + e1.getCompany().getName()); // e1 company name : Company_ABC
    System.out.println("e2 company name : " + e2.getCompany().getName()); // e2 company name : Company_XYZ
  }

}
