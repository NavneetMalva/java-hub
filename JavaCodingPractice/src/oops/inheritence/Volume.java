package oops.inheritence;

import java.util.Scanner;

class ObjectShape {

  public double getArea() {
    return 0;
  }

  public double getPerimeter() {
    return 0;
  }
}

class Circle extends ObjectShape {

  public double r;

  public Circle(double r) {
    super();
    this.r = r;
  }

  @Override
  public double getArea() {
    return r * r;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * r;
  }

}

public class Volume {

  public static void main(String[] args) {

    System.out.println("Enter the Radius: ");
    Scanner scan = new Scanner(System.in);
    double r = scan.nextDouble();
    scan.close();

    Circle circle = new Circle(r);
    System.out.println(circle.getArea());
    System.out.println(circle.getPerimeter());

  }

}
