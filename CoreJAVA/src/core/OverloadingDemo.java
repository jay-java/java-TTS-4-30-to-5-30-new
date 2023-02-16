package core;

//compiletime - method overloading
class Overload {
	Overload(int i) {
	}
	Overload(String name) {

	}
	Overload(double per) {

	}
	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}
}

public class OverloadingDemo {
	public static void main(String[] args) {
		Overload o = new Overload("");
		System.out.println(o.sum(1, 2));
		System.out.println(o.sum(1, 2, 3));
	}
}
