package reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con  =new ClassPathXmlApplicationContext("reference/config.xml");
		Employee e1 = (Employee)con.getBean("e1");
		System.out.println(e1);
	}
}
