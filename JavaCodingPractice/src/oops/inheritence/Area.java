package oops.inheritence;

class Shape {
	public int getArea() {
		return 0;

	}
}

class Square extends Shape {
	private int r;

	public Square(int r) {
		this.r = r;
	}

	@Override
	public int getArea() {
		return r * r;
	}
}

class Rectangle extends Shape {

	private int l;
	private int w;

	public Rectangle(int l, int w) {
		super();
		this.l = l;
		this.w = w;
	}

	@Override
	public int getArea() {
		return l * w;
	}
}

public class Area {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 30);
		System.out.println(rec.getArea());

		Square sq = new Square(10);
		System.out.println(sq.getArea());
	}

}
