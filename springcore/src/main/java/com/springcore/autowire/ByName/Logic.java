package com.springcore.autowire.ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Logic {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/config.xml");
		
		Emp empp = context.getBean("emp",Emp.class);
		System.out.println(empp);
	}

}
