package core;

//OOPS
//1.class
//2.object
//3.inheritance
//4.polymorphism
//5.abstraction
//6.Encapsulation

class Parent{
	Parent(){
		System.out.println("cons in parent clas");
	}
	public void parentMethod() {
		System.out.println("panret class");
	}
}
class CHild extends Parent{
	public void childMEthod() {
		System.out.println("child class");
	}
}
class GrandChild extends CHild{
	public void grandChildMEthod() {
		System.out.println("grand child class");
	}
}
class ABC extends Parent{
	public void abcMEthod() {
		System.out.println("abc class");
	}
}
public class nheritanceDemo {
	public static void main(String[] args) {
		CHild c = new CHild();
		c.childMEthod();
		c.parentMethod();
		GrandChild g = new GrandChild();
		g.parentMethod();
		g.childMEthod();
		g.grandChildMEthod();
		ABC a = new ABC();
		a.parentMethod();
		a.abcMEthod();
	}
}
