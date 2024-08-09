package com.springorm;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDao {
	private HibernateTemplate template;

	public void setHibernateTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	/*.....................save opration........................... */
	@Transactional
	public void saveEmployee(Employee e) {
		Integer i = (Integer) this.template.save(e);

	}
	
	/*.....................get the single data(object)...............*/
	public Employee getEmployee(int employeeId) {
		Employee employee = this.template.get(Employee.class, employeeId);
		return employee;
	}
	
	/*.....................get the all data..........................*/
	public List<Employee> getAllEmployee() {
		List<Employee> employee = this.template.loadAll(Employee.class);
		return employee;
	}
	
	/*.....................Deleting the all data..........................*/
	@Transactional
	public void deleteEmployee(int employeeId) {
		Employee employee = this.template.get(Employee.class,employeeId);
		this.template.delete(employee);
	}
	
	/*.....................Updateing the all data..........................*/
	@Transactional
	public void updateEmployee(Employee employee) {
		this.template.update(employee);
	}

	

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
}
