package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext con = new ClassPathXmlApplicationContext("com/core/config.xml");
		User u = (User)con.getBean("u1");
		
		System.out.println(u);
		User u2 = (User)con.getBean("u2");
		System.out.println(u2);
	}
	
}
