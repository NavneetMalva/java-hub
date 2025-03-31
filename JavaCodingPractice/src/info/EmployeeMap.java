package info;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

  public static void main(String[] args) {
    // Create a map to store Employee objects (id is the key)
    Map<Integer, Employee> employeeMap = new HashMap<>();

    // Create Employee objects
    Employee emp1 = new Employee(101, "John Doe", "Software Engineer");
    Employee emp2 = new Employee(102, "Jane Smith", "Project Manager");
    Employee emp3 = new Employee(102, "Jane Smith", "Project Manager");

    Employee emp4 = new Employee(103, "Summer Smith", "Tester");
    Employee emp5 = new Employee(103, "Morty Smith", "SpringBoot Developer");

    /**
     * since we have emp2 and emp3 have the same details
     * It will overwrite it, and we will have 2 entries, instead of 3 entries.
     */

    // Add Employee objects to the map
    employeeMap.put(emp1.getId(), emp1);
    employeeMap.put(emp2.getId(), emp2);
    employeeMap.put(emp3.getId(), emp3);
    employeeMap.put(emp4.getId(), emp4);
    employeeMap.put(emp5.getId(), emp5);

    // Iterate over the map and display all employees
    for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
      System.out.println("Employee ID: " + entry.getKey() + ", Employee Info: " + entry.getValue());
    }

    /**
     * Employee ID: 101, Employee Info: Employee{id=101, name='John Doe', designation='Software Engineer'}
     * Employee ID: 102, Employee Info: Employee{id=102, name='Jane Smith', designation='Project Manager'}
     * Employee ID: 103, Employee Info: Employee{id=103, name='Morty Smith', designation='SpringBoot Developer'}
     */
  }
}


class Employee {

  private int id;
  private String name;
  private String designation;

  // Constructor
  public Employee(int id, String name, String designation) {
    this.id = id;
    this.name = name;
    this.designation = designation;
  }

  // Getters and Setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", designation='" + designation + '\'' +
        '}';
  }
}



