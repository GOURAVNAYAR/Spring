package com.springcore.autowire.ByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Logic {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/ByType/config.xml");

		Driver dri = context.getBean("driver", Driver.class);
		System.out.println(dri);
	}
}
