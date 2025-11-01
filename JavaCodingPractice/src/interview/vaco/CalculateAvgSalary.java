package interview.vaco;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
  private String dept;
  private Double salary;

  public Employee(String dept, Double salary) {
    this.dept = dept;
    this.salary = salary;
  }

  public String getDept() {
    return dept;
  }

  public Double getSalary() {
    return salary;
  }
}

public class CalculateAvgSalary {
  public static void main(String[] args) {

    List<Employee> list = List.of(
        new Employee("cs", 1000.50),
        new Employee("it", 1200.20),
        new Employee("cs", 500.00)
    );

    Map<String, Double> avgSalaryByDept = list.stream()
        .collect(Collectors.groupingBy(
            Employee::getDept,
            Collectors.averagingDouble(Employee::getSalary)
        ));
    System.out.println(avgSalaryByDept);
  }
}
