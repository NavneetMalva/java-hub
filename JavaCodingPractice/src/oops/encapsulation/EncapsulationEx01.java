package oops.encapsulation;


/*Abstraction	
Abstraction is process of hiding the implementation details and showing only the functionality to the users.

Encapsulation
Encapsulation is a process of binding data and methods together in a single unit,  
providing controlled access to data.

** Steps to Achieve Encapsulation in Java
Make Fields Private: Declare fields as private to restrict direct access from outside the class.
Provide Public Getter and Setter Methods: Define public getter and setter methods to allow controlled access to the private fields.
This lets you validate, modify, or control access to the fields as needed.

- The process of grouping together the data members and corresponding methods -> Encapsulation
- If any component follows the data hiding and abstraction is the concept of Encapsulation
	Encapsulation = data hiding + abstraction;
*/

class CircleArea {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

	public double calculatePerimeter(double r) {
		return 2 * Math.PI * r;
	}

	public static void main(String[] args) {
		CircleArea circle = new CircleArea();
		System.out.println(circle.calculateArea(5));
		System.out.println(circle.calculatePerimeter(5));
	}

}
