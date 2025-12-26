package designpattern.creationaldesign.factorydesign;

interface Employee {
  double fetchSalary();
}

class AndroidDeveloper implements Employee {
  @Override
  public double fetchSalary() {
    System.out.println("Fetching Android Developer Salary..");
    return 50000;
  }
}

class WebDeveloper implements Employee {
  @Override
  public double fetchSalary() {
    System.out.println("Fetching Web Developer salary..");
    return 40000;
  }
}

class EmployeeFactory {
  public static Employee getEmployee(String empType) {
    if (empType.trim().equalsIgnoreCase("Android")) {
      return new AndroidDeveloper();
    } else if (empType.trim().equalsIgnoreCase("Web")) {
      return new WebDeveloper();
    } else {
      return null;
    }
  }
}


class DeveloperClient {
  public static void main(String[] args) {
    Employee employee = EmployeeFactory.getEmployee("Web");
    double salary = employee.fetchSalary();
    System.out.println("Salary : " + salary);
  }
}
