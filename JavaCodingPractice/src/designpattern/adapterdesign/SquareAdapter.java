package designpattern.adapterdesign;

class Square {

  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double getSide() {
    return side;
  }

}

/**
 * SquareAdapter Class: Implements the Rectangle interface, adapting the Square class to behave like
 * a Rectangle. It calculates the area using the Square's side length.
 * <p>
 * We could technically implement the Rectangle interface directly in the Square class, but doing so
 * would have some downsides and go against the purpose of the Adapter pattern.
 */

class SquareAdapter implements Rectangle {

  private Square square;

  public SquareAdapter(Square square) {
    this.square = square;
  }

  @Override
  public double getArea() {
    return square.getSide() * square.getSide();
  }
}
