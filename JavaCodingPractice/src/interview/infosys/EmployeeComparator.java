package interview.infosys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Teacher implements Comparable<Teacher> {
  private int id;
  private String name;
  private double salary;

  public Teacher(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "Teacher{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", salary=" + salary +
        '}';
  }

  @Override
  public int compareTo(Teacher o) {
    int eid1 = this.id;
    int eid2 = o.id;
    if (eid1 > eid2) {
      return +1;
    } else if (eid1 < eid2) {
      return -1;
    } else {
      return 0;
    }
  }
}

class ComparableDemo {
  public static void main(String[] args) {
    List<Teacher> list = new ArrayList<>(List.of(
        new Teacher(15, "John", 15000),
        new Teacher(21, "RickMorty", 13000),
        new Teacher(12, "Jane", 18000),
        new Teacher(10, "Mark", 14000),
        new Teacher(15, "JohnDoe", 19000),
        new Teacher(20, "Jane", 20000),
        new Teacher(5, "Rick", 13000)
    ));

    Collections.sort(list);
    System.out.println(list);

    System.out.println("Salary Comparator...");
    Collections.sort(list, new TeacherSalaryComparator());
    System.out.println(list);

    System.out.println("Name Salary comparator...");
    Collections.sort(list, new NameSalaryComparator());
    System.out.println(list);

  }
}

class TeacherSalaryComparator implements Comparator<Teacher> {
  @Override
  public int compare(Teacher o1, Teacher o2) {
    return Double.compare(o1.getSalary(), o2.getSalary());
  }
}

class NameSalaryComparator implements Comparator<Teacher> {
  @Override
  public int compare(Teacher o1, Teacher o2) {
    int flag = o1.getName().compareTo(o2.getName());
    if (flag == 0) {
      flag = Double.compare(o1.getSalary(), o2.getSalary());
    }
    return flag;
  }
}