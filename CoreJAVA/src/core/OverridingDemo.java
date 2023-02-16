package core;

class OVerride{
	public void show() {
		System.out.println("show inside override class");
	}
}
class Call extends OVerride{
	public void show() {
		System.out.println("show inside call class");
		super.show();
	}
}
public class OverridingDemo {
	public static void main(String[] args) {
		Call c = new Call();
		c.show();
	}
}
