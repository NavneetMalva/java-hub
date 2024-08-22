package common;

class Person {
	String name, address;
	int age;

	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}

class Employee extends Person {
	int salary;

	public Employee(String name, String address, int age, int salary) {
		super(name, address, age);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", address=" + address + ", age=" + age + " ]";
	}

}

public class ConstructorChaining {

	public static void main(String[] args) {

		Employee emp = new Employee("Nick", "India", 26, 40000);
		System.out.println(emp);
		System.out.println(emp.name);
		System.out.println(new Person("Morty", "Canada", 24));

	}

}
