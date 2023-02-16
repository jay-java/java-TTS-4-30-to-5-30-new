package core;

abstract class RBI {
	abstract public void interrest();
	abstract public void homeloan();
	public static void REporate() {
		System.out.println("repo rate : 4%");
	}
}
class SBI extends RBI {
	@Override
	public void interrest() {
		// TODO Auto-generated method stub
		System.out.println("sbi interest : 5%");
	}
	@Override
	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("sbi homeloan : 7%");
	}
}
class PNB extends RBI {
	@Override
	public void interrest() {
		// TODO Auto-generated method stub
		System.out.println("pnb interest : 6%");
	}
	@Override
	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("pnb hoemloan : 8%");
	}
}
class JAVA extends RBI {
	@Override
	public void interrest() {
		// TODO Auto-generated method stub
		System.out.println("java intaerst : 8%");
	}
	@Override
	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("java homenloan : 7%");
	}
}
public class BAstractionDemo {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interrest();
		s.homeloan();
		s.REporate();
		SBI.REporate();
		PNB p = new PNB();
		p.interrest();
		p.homeloan();
		PNB.REporate();
		JAVA j = new JAVA();
		j.interrest();
		j.homeloan();
		JAVA.REporate();
	}
}
