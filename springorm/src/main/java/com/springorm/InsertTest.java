package com.springorm;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/applicationContext.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		
		
	// Save a new employee
		Employee e = new Employee();
		e.setEmployeeId(200);
		e.setEmployeeName("Gourav");
		e.setEmployeeSalry(31546);
		dao.saveEmployee(e);

	// Get a single employee
		Employee retrievedEmployee = dao.getEmployee(200);
		System.out.println("Employee retrieved: " + retrievedEmployee.getEmployeeName());
		
	 // Delete an employee
        dao.deleteEmployee(200);
        System.out.println("Employee deleted!");
        
     // Update an existing employee
        e.setEmployeeName("Gourav Nayar Update");
        e.setEmployeeSalry(55000);
        dao.updateEmployee(e);
        System.out.println("Employee updated!");
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * while(true) { switch(number) case 1 : System.out.println(""); case 2 :
		 * System.out.println(""); case 3 : System.out.println(""); case 4 :
		 * System.out.println(""); case 5 : System.out.println(""); }
		 */

	}
}
