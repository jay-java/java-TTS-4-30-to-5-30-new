package core;
class Mobile{
	private int ram;
	private String model;
	private double price;
	public Mobile() {
		
	}
	public Mobile(int ram,String model,double price) {
		this.ram=ram;
		this.model=model;
		this.price=price;
	}
	public void setRam(int ram) {
		this.ram=ram;
	}
	public int getRam() {
		return ram;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "ram : "+ram+" model : "+model+" price : "+price;
	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.setRam(5);
		m1.setModel("samsung");
		m1.setPrice(20000.99);
		System.out.println(m1.getRam());
		System.out.println(m1.getModel());
		System.out.println(m1.getPrice());
		Mobile m2 = new Mobile(10, "ONe plus", 30000);
		System.out.println(m2);
	}
}
