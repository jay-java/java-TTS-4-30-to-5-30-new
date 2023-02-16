package core;
interface inter1{
	public void interface1();
	public static void interface4() {
		System.out.println("interface 4");
	}
}
interface inter2 extends inter1{
	public void interface2();
	public static void interface5() {
		System.out.println("interface 5");
	}
}
interface inter3{
	public void interface3();
	public static void interface6() {
		System.out.println("interface 6");
	}
}
class interCall implements inter2,inter3{

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}
	
}
public class INtefaceDemo {
	public static void main(String[] args) {
		interCall i = new interCall();
		i.interface1();
		i.interface2();
		i.interface3();
		inter1.interface4();
		inter2.interface5();
		inter3.interface6();
	}
}
