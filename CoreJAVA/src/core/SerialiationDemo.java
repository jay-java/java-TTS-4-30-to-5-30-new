package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Stud implements Serializable{
	int rollno;
	String name;
	double per;
	public Stud() {
	}
	public Stud(int rollno, String name, double per) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}
}
public class SerialiationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Stud s1 = new Stud(1,"java",67.67);
		FileOutputStream fos = new FileOutputStream("serializable.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("object written successfully");
		
		
		FileInputStream fis = new FileInputStream("serializable.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Stud s = (Stud)ois.readObject();
		System.out.println(s);
	}
}
