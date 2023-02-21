package core;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector list = new Vector();
		list.add(12);
		list.add("name");
		list.add('f');
		list.add(false);
		list.add(12467867);
		list.add(4564.4);
		list.add(4567);
		list.add(12);
		System.out.println(list);
		System.out.println("size of list : "+list.size());
		list.remove(3);
		System.out.println(list);
		System.out.println("size of list : "+list.size());
		Enumeration em = list.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
