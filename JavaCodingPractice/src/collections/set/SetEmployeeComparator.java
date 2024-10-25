package collections.set;

import java.util.Comparator;
import java.util.TreeSet;

// Since its a custom class, Employee class needs to implement the Comparable to define sorting method.
class Employee implements Comparable<Employee> {
    int eid;
    String name;

    public Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + "eid=" + eid + ", name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Employee e) {
        int eid1 = this.eid;
        int eid2 = e.eid;
        if (eid1 > eid2)
            return +1;
        else if (eid1 < eid2)
            return -1;
        else
            return 0;
    }
}

public class SetEmployeeComparator {
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "John");
        Employee e2 = new Employee(10, "Summer");
        Employee e3 = new Employee(200, "Morty");
        Employee e4 = new Employee(150, "Anna");
        Employee e5 = new Employee(250, "Emma");

        TreeSet<Employee> t1 = new TreeSet<>(); // this will be using default sorting order, defined for Employee class already.
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1); //[{eid=10, name='Summer'}, {eid=100, name='John'}, {eid=150, name='Anna'}, {eid=200, name='Morty'}, {eid=250, name='Emma'}]


        // Using our own Custom comparator class
        TreeSet<Employee> t2 = new TreeSet<>(new MyEmployeeComparator());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        System.out.println(t2); // [{eid=150, name='Anna'}, {eid=250, name='Emma'}, {eid=100, name='John'}, {eid=200, name='Morty'}, {eid=10, name='Summer'}]
        // sorted based on the name alphabetical order

    }
}

// creating our own sorting method instead of natural sorting defined for Employee class,
// will implement 'Comparator'
class MyEmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}
