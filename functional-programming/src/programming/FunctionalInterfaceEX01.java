package programming;

@FunctionalInterface
interface Sayable {
	void say(String str);
}
//  Its not even getting used down below 
//  because in funEX01 class add method is already defined.


//This one is getting used properly.
@FunctionalInterface 
interface Adder{ 
	int add(int a, int b); 
} 
 
// This one is getting used properly.
@FunctionalInterface
interface Teller{
	void tell(String str);
}


public class FunctionalInterfaceEX01 {
	
	public void say(String str) {
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		
		FunctionalInterfaceEX01 interfaceEx = new FunctionalInterfaceEX01();
		interfaceEx.say("hello there :)");
		
		// Example of Lambda function which is actually using the functionalInterface
		Adder adder = (a,b) -> a+b;
		System.out.println(adder.add(5, 10));
		
		// Example of Lambda function which is actually using the functionalInterface
		Teller teller = (str) -> System.out.println(str);
		teller.tell("telling...");
		
	}

}
