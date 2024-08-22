package oops.inheritence;

class Employee {

	private int salary;

	public Employee(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void work() {
		System.out.println("Employee working");
	}

}

class HRManager extends Employee {
	
	public HRManager(int salary) {
		super(salary);
	}
	
	@Override
	public void work() {
		System.out.println("Managing Employees.");
	}

	public void addEmployee() {
		System.out.println("Adding Employee");
	}

}

public class Organization {

	public static void main(String[] args) {
		HRManager hr = new HRManager(40000);
		hr.work();
		System.out.println("HR Salary : "+ hr.getSalary());
		
		Employee emp = new Employee(50000);
		emp.work();
		System.out.println("Emp Salary : "+ emp.getSalary());
		
	}

}
