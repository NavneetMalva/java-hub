package designpattern.adapterdesign;

public class RectangleImpl implements Rectangle {
    private double width;
    private double height;

    public RectangleImpl(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
