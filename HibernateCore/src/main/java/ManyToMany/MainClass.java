package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("a");

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("b");
		
		Project p1 = new Project();
		p1.setId(1);
		p1.setName("java");
		

		Project p2 = new Project();
		p2.setId(2);
		p2.setName("python");
		
		List<Employee> elist = new ArrayList<Employee>();
		elist.add(e1);
		elist.add(e2);
		
		List<Project> plist = new ArrayList<Project>();
		plist.add(p1);
		plist.add(p2);
		
		e1.setProjects(plist);	
		e2.setProjects(plist);
		p1.setEmployees(elist);
		p2.setEmployees(elist);
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		
		tx.commit();
		session.close();
		sf.close();
	}
}
