package OneToManyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClasss {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Teacher t1 = new Teacher();
		t1.setId(1);
		t1.setName("abc");

		Teacher t2 = new Teacher();
		t2.setId(2);
		t2.setName("def");

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("a");

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("b");
		

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("c");
		
		List<Student> list1 = new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		
//		List<Student> list2 = new ArrayList<Student>();
//		list2.add(s2);
//		list2.add(s3);
		
		t1.setStudents(list1);
//		t2.setStudents(list2);
		
		s1.setTeacher(t1);
		s2.setTeacher(t1);
//		s2.setTeacher(t2);
//		s3.setTeacher(t2);
		
		session.save(t1);
//		session.save(t2);
		session.save(s1);
		session.save(s2);
//		session.save(s3);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
