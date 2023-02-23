package core;

import java.util.ArrayList;
import java.util.List;

class Laptop{
	private int ram;
	private double price;
	private String model;
	public Laptop(int ram,double price,String model) {
		this.ram =ram;
		this.price=price;
		this.model=model;
	}
	@Override
	public String toString() {
		return "ram : "+ram+" price : "+price+" model : "+model;
	}
}
public class ListPractical {
	public static void main(String[] args) {
		Laptop l1 = new Laptop(8, 8999, "dell");
		Laptop l2 = new Laptop(12, 11999, "hp");
		Laptop l3 = new Laptop(16, 10999, "lenovo");
		List<Laptop> list =new ArrayList<Laptop>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		System.out.println(list);
	}
}
