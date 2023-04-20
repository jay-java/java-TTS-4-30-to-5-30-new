package OneToOne;

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
		
		Question q1 = new Question();
		q1.setId(1);
		q1.setQuestion("What is java?");
		

		Question q2 = new Question();
		q2.setId(2);
		q2.setQuestion("What is python?");
		
		Answer a1 = new Answer();
		a1.setId(1);
		a1.setAnswer("WD,ML,APP");
		
		Answer a2 = new Answer();
		a2.setId(2);
		a2.setAnswer("DS,ML,AI");
		
		q1.setAnswer(a1);
		q2.setAnswer(a2);
		a1.setQuestion(q1);
		a2.setQuestion(q2);
		
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);
		tx.commit();
		session.close();
		sf.close();
	}
}
