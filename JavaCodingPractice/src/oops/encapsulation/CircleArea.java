package oops.encapsulation;


/*Abstraction	
Abstraction is process of hiding the implementation details and showing only the functionality to the users.

Encapsulation
Encapsulation is a process of binding data and methods together in a single unit,  
providing controlled access to data. 
*/

public class CircleArea {

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
