package info;

import java.util.Comparator;
import java.util.TreeMap;

class Employees implements Comparable<Employees> {

  int id;
  String name;
  long salary;

  public Employees(int id, String name, long salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
  }

  @Override
  public int compareTo(Employees e) {
    int id1 = this.id;
    int id2 = e.id;
    if (id1 > id2) {
      return +1;
    } else if (id1 < id2) {
      return -1;
    } else {
      return 0;
    }
  }
}

public class EmployeeMapComparator {

  public static void main(String[] args) {
    Employees e1 = new Employees(10, "John", 20000);
    Employees e2 = new Employees(21, "Emma", 10000);
    Employees e3 = new Employees(13, "Mary", 13000);
    Employees e4 = new Employees(9, "Anna", 15000);
    Employees e5 = new Employees(10, "John", 17000);

    TreeMap<Employees, String> tm = new TreeMap<Employees, String>();
    tm.put(e1, "John");
    tm.put(e2, "Emma");
    tm.put(e3, "Mary");
    tm.put(e4, "Anna");
    tm.put(e5, "John");
    System.out.println(tm);
    //{{id=9, name=Anna, salary=15000}=Anna, {id=10, name=John, salary=20000}=John, {id=13, name=Mary, salary=13000}=Mary, {id=21, name=Emma, salary=10000}=Emma}

    TreeMap<Employees, String> tm2 = new TreeMap<Employees, String>(
        new MyEmployeesComparator()); // sorted based on salary
    tm2.put(e1, "John");
    tm2.put(e2, "Emma");
    tm2.put(e3, "Mary");
    tm2.put(e4, "Anna");
    tm2.put(e5, "John");
    System.out.println(tm2);
    // {{id=21, name=Emma, salary=10000}=Emma, {id=13, name=Mary, salary=13000}=Mary, {id=9, name=Anna, salary=15000}=Anna, {id=10, name=John, salary=17000}=John, {id=10, name=John, salary=20000}=John}
  }
}

class MyEmployeesComparator implements Comparator<Employees> {

  @Override
  public int compare(Employees e1, Employees e2) {
    return (int) (e1.salary - e2.salary);
  }
}
