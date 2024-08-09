package com.springorm.Explane.get;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {

	private HibernateTemplate hibernatetemplate;


	public void setHibernateTemplate(HibernateTemplate template) {
		this.hibernatetemplate = template;
	}
	
	/*save Opration*/
	@Transactional
	public void save(Student student) {
		Integer i = (Integer) this.hibernatetemplate.save(student);
		
	}


	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}


	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}


	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		
	}


	
}
