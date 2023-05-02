package constructorInjection;

public class Data {
	private int a;
	private int b;

	public Data() {

	}
	public Data(int a, int b) {
		System.out.println("setting values by cons -->>> integer argument");
		this.a = a;
		this.b = b;
	}
	public Data(String a, String b) {
		System.out.println("setting values by cons --> String cons");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	public Data(double a, double b) {
		System.out.println("setting values by cons --->> double cons");
		this.a = (int)a;
		this.b = (int)b;
	}

	public void add(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a + b);
	}
	@Override
	public String toString() {
		return "Data [a=" + a + ", b=" + b + "]";
	}
	
}
