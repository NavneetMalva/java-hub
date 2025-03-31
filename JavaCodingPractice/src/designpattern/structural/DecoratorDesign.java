package designpattern.structural;

/**
 * Decorator design pattern belongs to the category of structural pattern that lets users add new
 * features to an existing object without modifying the structure. This pattern creates a class
 * called decorator class that acts as a wrapper to the existing class by keeping the signatures of
 * class methods intact. This pattern makes use of abstract classes and interfaces with composition
 * for implementing the wrapper. They are mostly used to apply SRP (Single Responsibility Principle)
 * as we divide functionalities into classes with unique concerns. This pattern is structurally
 * similar to the chain of responsibility pattern. Following are the steps to implement decorator
 * design pattern:
 * <p>
 * Create an interface and concrete classes that implement this interface. Create an abstract
 * decorator class that implements the above interface. Create a concrete decorator class that
 * extends the above abstract class. Use the concrete decorator class to decorate the interface
 * objects and verify the output.
 */

/**
 * The Shape interface represents the core component of the decorator pattern.
 */
interface Shape {

  void draw();
}

/**
 * Concrete implementation of Shape: Rectangle.
 */
class Rectangle implements Shape {

  @Override
  public void draw() {
    System.out.println("Rectangle Drawn...");
  }
}

/**
 * Concrete implementation of Shape: Triangle.
 */
class Triangle implements Shape {

  @Override
  public void draw() {
    System.out.println("Triangle Drawn...");
  }
}

/**
 * Abstract decorator class implementing the Shape interface. It holds a reference to a Shape object
 * and delegates the drawing task.
 */
abstract class ShapeDecorator implements Shape {

  protected Shape decoratedShape;

  public ShapeDecorator(Shape decoratedShape) {
    this.decoratedShape = decoratedShape;
  }

  @Override
  public void draw() {
    decoratedShape.draw();
  }
}

/**
 * Concrete decorator class adding red color functionality to shapes.
 */
class RedColorDecorator extends ShapeDecorator {

  public RedColorDecorator(Shape decoratedShape) {
    super(decoratedShape);
  }

  @Override
  public void draw() {
    decoratedShape.draw();
    setRedBorder();
  }

  private void setRedBorder() {
    System.out.println("Red color Border added...");
  }
}

/**
 * Main class demonstrating the Decorator Design Pattern.
 */
public class DecoratorDesign {

  public static void main(String[] args) {
    // Creating a simple rectangle
    Shape rectangle = new Rectangle();
    System.out.println("Basic Rectangle:");
    rectangle.draw();

    // Decorating rectangle with a red border
    Shape redRectangle = new RedColorDecorator(rectangle);
    System.out.println("Red Decorated Rectangle:");
    redRectangle.draw();

    // Creating a simple triangle
    Shape triangle = new Triangle();
    System.out.println("Basic Triangle:");
    triangle.draw();

    // Decorating triangle with a red border
    Shape redTriangle = new RedColorDecorator(triangle);
    System.out.println("Red Decorated Triangle:");
    redTriangle.draw();
  }
}
