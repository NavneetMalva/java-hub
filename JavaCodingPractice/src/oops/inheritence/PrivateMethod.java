package oops.inheritence;

//Private methods cannot be overridden as they are bonded during compile time. 
//Therefore we can’t even override private methods in a subclass.

class SuperClass {
	private void privateMethod() {
		System.out.println("This is a private method in SuperClass");
	}

	public void publicMethod() {
		System.out.println("This is a public method in SuperClass");
		privateMethod();
	}
}

class SubClass extends SuperClass {
	// This is a new method with the same name as the
	// private method in SuperClass
	private void privateMethod() {
		System.out.println("This is a private method in SubClass");
	}

	// This method overrides the public method in SuperClass
	public void publicMethod() {
		System.out.println("This is a public method in SubClass");
		privateMethod(); // calls the private method in
							// SubClass, not SuperClass
	}
}

public class PrivateMethod {
	public static void main(String[] args) {
		SuperClass obj1 = new SuperClass();
		obj1.publicMethod(); // calls the public method in SuperClass
		// obj1.privateMethod(); // will through the ERROR

		SubClass obj2 = new SubClass();
		obj2.publicMethod(); // calls the overridden public method in SubClass
	}
}
