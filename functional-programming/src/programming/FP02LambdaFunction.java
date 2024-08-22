package programming;

public class FP02LambdaFunction {
	public static void main(String[] args) {
		int x = 10; // effectively final variable

		Runnable runnable = () -> {
//			x = 20; // This line would cause a compile-time error
			System.out.println("Value of x :" + x);
		};
		runnable.run();

//		In Java, lambda expressions have access to variables from their enclosing scope. 
//		However, there is a restriction that these variables must be effectively final.
//		To work around this restriction when you need to modify a variable within a lambda expression, 
//		one common approach is to use an array or an object to hold the mutable state,

		int[] y = { 10 };
		Runnable runnableWithFinal = () -> {
			y[0] = 20;
			System.out.println("Value of y :" + y[0]);
		};
		runnableWithFinal.run();

	}

}
