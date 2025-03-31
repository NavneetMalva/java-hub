package designpattern.adapterdesign;
// structural design

/**
 * The Adapter design pattern is a structural pattern that allows incompatible interfaces to work
 * together. It acts as a bridge between two interfaces, allowing classes to work together even if
 * they have incompatible interfaces.
 * <p>
 * Scenario Imagine you have an existing Rectangle class that requires width and height to calculate
 * its area. Now, you want to work with Square objects, which only have one side length, but you
 * still want to use the Rectangle interface to calculate their area.
 */
public class AdapterPattern {

  public static void main(String[] args) {
    Rectangle rectangle = new RectangleImpl(6, 10);
    System.out.println(rectangle.getArea());

    Square square = new Square(6);
    SquareAdapter squareAdapter = new SquareAdapter(square);
    System.out.println(squareAdapter.getArea());
  }
}
