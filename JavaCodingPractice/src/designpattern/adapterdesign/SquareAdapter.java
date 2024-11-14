package designpattern.adapterdesign;

/**
 * SquareAdapter Class: Implements the Rectangle interface, adapting the Square class to behave like a Rectangle.
 * It calculates the area using the Square's side length.
 *
 * We could technically implement the Rectangle interface directly in the Square class,
 * but doing so would have some downsides and go against the purpose of the Adapter pattern.
 */

public class SquareAdapter  implements Rectangle{

    private Square square;

    public SquareAdapter(Square square){
        this.square=square;
    }

    @Override
    public double getArea() {
        return square.getSide()*square.getSide();
    }
}
