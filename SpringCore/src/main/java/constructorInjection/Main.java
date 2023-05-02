package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("constructorInjection/config.xml");
		Data d = (Data)con.getBean("d1");
		System.out.println(d);
	}
}
