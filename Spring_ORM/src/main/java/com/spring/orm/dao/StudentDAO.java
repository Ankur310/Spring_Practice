package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDAO {

	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void saveStudent(Student student) {
		this.hibernateTemplate.persist(student);
		
	}
	
	public Student getStudent() {
		return this.hibernateTemplate.get(Student.class,1);
	}
	
	public List<Student> getAllStudent(){
		return this.hibernateTemplate.loadAll(Student.class);
	}
	
	@Transactional
	public void removeStudent(int id) {
		Student std = this.hibernateTemplate.get(Student.class,id);
		this.hibernateTemplate.delete(std);
	}
	
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	
	
}

