package designpattern.creationaldesign.adstractdesign;

/**
 * Abstract Factory defines an interface for creating all distinct products
 * but leaves the actual product creation to concrete factory classes. Each factory type corresponds to a certain product variety.
 * The client code calls the creation methods of a factory object instead of creating products directly with a constructor call (new operator).
 * Since a factory corresponds to a single product variant, all its products will be compatible.
 *
 * Client code works with factories and products only through their abstract interfaces.
 * This lets the client code work with any product variants, created by the factory object.
 * You create a new concrete factory class and pass it to the client code.
 */
interface Employee {
  double fetchSalary();

  String fetchName();
}

class AndroidDev implements Employee {
  @Override
  public double fetchSalary() {
    return 50000;
  }

  @Override
  public String fetchName() {
    return "Android Developer";
  }
}

class WebDeveloper implements Employee {
  @Override
  public double fetchSalary() {
    return 40000;
  }

  @Override
  public String fetchName() {
    return "Web Developer";
  }
}

/**
 * Creating an abstract class to create the Employee Object
 */
abstract class EmployeeAbstractFactory {
  abstract Employee createEmployee();
}

class EmployeeFactory {
  public static Employee getEmployee(EmployeeAbstractFactory factory) {
    return factory.createEmployee();
  }
}

class AndroidDevFactory extends EmployeeAbstractFactory {
  @Override
  Employee createEmployee() {
    return new AndroidDev();
  }
}

class WebDevFactory extends EmployeeAbstractFactory {
  @Override
  Employee createEmployee() {
    return new WebDeveloper();
  }
}


public class AbstractDesignPattern {
  public static void main(String[] args) {
    Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
    System.out.println(e1.fetchName());

    Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
    System.out.println(e2.fetchName());
  }
}
