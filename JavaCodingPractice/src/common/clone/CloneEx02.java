package common.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Deep Cope Example
 */
@Data
@AllArgsConstructor
class Company3 implements Cloneable {
  private String name;

  @Override
  public Company3 clone() throws CloneNotSupportedException {
    return (Company3) super.clone();
  }
}

@Data
@AllArgsConstructor
class Emp3 implements Cloneable {
  private String name;
  private int age;
  private Company3 company;

  @Override
  public Emp3 clone() throws CloneNotSupportedException {
    Emp3 emp = (Emp3) super.clone();
    emp.company = company.clone();
    return emp;
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Emp3 e1 = new Emp3("Mike", 25, new Company3("Company_ABC"));
    System.out.println("e1 company name : " + e1.getCompany().getName());

    Emp3 e2 = e1.clone();
    e2.getCompany().setName("Company_XYZ");
    System.out.println("e1 company name : " + e1.getCompany().getName()); // e1 company name : Company_ABC
    System.out.println("e2 company name : " + e2.getCompany().getName()); // e2 company name : Company_XYZ
    /**
     * In the above example, we have overridden the clone method in our employee class,
     * and we called the clone method on a mutable company object.
     */

  }

}