package oops.abstraction;

/*Abstraction	
Abstraction is process of hiding the implementation details and showing only the functionality to the users.

Encapsulation
Encapsulation is a process of binding data and methods together in a single unit,  
providing controlled access to data. 
*/
/**
 * Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
 * Abstract method: can only be used in an abstract class, and it does not have a body. 
 * The body is provided by the subclass (inherited from).
 */
abstract class Animal {
	public abstract void sound();
}

class Lion extends Animal {
	public void sound() {
		System.out.println("Lion roaring...");
	}
}

class Tiger extends Animal {
	public void sound() {
		System.out.println("Tiger growls...");
	}
}

public class AnimalSound {
	public static void main(String[] args) {
		Animal lion = new Lion();
		lion.sound();
		Animal tiger = new Tiger();
		tiger.sound();

	}

}
