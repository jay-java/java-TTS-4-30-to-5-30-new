package core;

class Construct {
	public Construct() {
		System.out.println("hello defualt constructor");
	}

	public Construct(String name, int i) {
		System.out.println("hello para constructor : " + i + name);
	}

	public void run() {
		System.out.println("run method inside constructor class");
	}
}

class Area {
	int i, j;

	Area() {
		System.out.println("default");
	}

	Area(int i, int j) {
		this.i = i;
		this.j = j;
		System.out.println("area of rectangle : " + (i * j));
	}

	public void showArea() {
		System.out.println("area of rectangle : " + (i * j));
	}
}

class Rectangle {
	int i, j;

	public Rectangle(Area a) {
		this.i = a.i;
		this.j = a.j;
		System.out.println("area of rectangle : " + (i * j));
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		Construct c = new Construct("java", 12);
		c.run();
		Area a = new Area(2, 3);
		a.showArea();
		Rectangle r = new Rectangle(a);
	}
}
