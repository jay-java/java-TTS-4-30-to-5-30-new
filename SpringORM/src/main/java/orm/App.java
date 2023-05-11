package orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("started");
		ApplicationContext con = new ClassPathXmlApplicationContext("orm/config.xml");
		UserDao dao = (UserDao)con.getBean("dao");
		User u = new User(3, "java", 9865321);
		dao.insertUser(u);
		System.out.println("data inserted");
	}
}
