package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set list = new HashSet();
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
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
