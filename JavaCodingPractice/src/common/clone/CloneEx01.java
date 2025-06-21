package common.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Emp implements Cloneable {
  private String name;
  private int age;

  public static void main(String[] args) throws CloneNotSupportedException {
    Emp e1 = new Emp("Mike", 25);
    System.out.println("e1 name : " + e1.getName());
    Emp e2 = (Emp) e1.clone();
    e2.setName("John");
    System.out.println("e1 name : " + e1.getName()); // Mike
    System.out.println("e2 name : " + e2.getName()); // John
    /**
     * In the above example, we have only primitive types in our Employee class.
     * and cloning is working as expected.
     */
  }
}

/**
 * What if we have an Object type i.e., another class reference
 * Example of Shallow Copy
 */

@Data
@AllArgsConstructor
class Company {
  private String name;
}

@Data
@AllArgsConstructor
class Emp2 implements Cloneable {
  private String name;
  private int age;
  private Company company;

  public static void main(String[] args) throws CloneNotSupportedException {
    Emp2 e1 = new Emp2("Mike", 25, new Company("Company_ABC"));
    System.out.println("e1 company name : " + e1.getCompany().getName());

    Emp2 e2 = (Emp2) e1.clone();
    e2.getCompany().setName("Company_XYZ");
    System.out.println("e1 company name : " + e1.getCompany().getName()); // e1 company name : Company_XYZ
    System.out.println("e2 company name : " + e2.getCompany().getName()); // e2 company name : Company_XYZ
    /**
     * By default, Object’s clone() method provides Shallow copy.
     * <p>
     * Shallow Copy : When we use the default implementation of
     * clone() method, a shallow copy of object is returned, meaning if the object
     * that we are trying to clone contains both primitive variables and non-primitive or reference type variable,
     * then only the object’s reference is copied, not the entire object itself.
     */

  }
}
