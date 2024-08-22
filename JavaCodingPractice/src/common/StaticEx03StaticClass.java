package common;

/* A class can be made static only if it is a nested class.
* Nested static class doesn’t need reference of Outer class
* A static class cannot access non-static members of the Outer class
*/

// non-static class 
public class StaticEx03StaticClass {

	private static String str = "This is a static String.";

	// static class
	static class MyStaticClass {

		// non-static method
		void display() {
			System.out.println(str);
		}

	}

	public static void main(String[] args) {
		/*
		 * To create instance of nested class we didn't need the outer class instance
		 * but for a regular nested class you would need to create an instance of outer
		 * class first
		 */
		
		StaticEx03StaticClass.MyStaticClass obj = new StaticEx03StaticClass.MyStaticClass();
		obj.display();
		
	}

}
