package com.springcoreConstructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcoreConstructor_Injection/config.xml");
		Person p = (Person) context.getBean("spring_person");
		System.out.println(p);
	}
}
