package com.springorm.Explane.get;

import com.springorm.Employee;
import com.springorm.EmployeeDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Logic {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/Explane/get/ApplicationContext.xml");
		StudentDao studentdao = (StudentDao) context.getBean("studentDao");
		
		
	// Save a new employee
		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("Gourav");	
		student.setStudentSalry("56479");
		studentdao.saveStudent(student);

	}
}
