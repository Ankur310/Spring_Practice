package com.masai.question3.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springOrm.Entities.Employee;

public class EmployeeDAO {

	private HibernateTemplate hibernateTemplate;
	
	//for saving data
	@Transactional
	public void saveEmployee(Employee emp) {
		this.hibernateTemplate.save(emp);
		System.out.println("Saved Data Successfully!");
	}
	
	//for extracting data
	public List<Employee> getAllEmployee(Employee emp) {
		List<Employee> ls = this.hibernateTemplate.loadAll(Employee.class);
		
		return ls;
	}
	
	public Employee getEmpById(int id) {
		Employee emp = this.hibernateTemplate.get(Employee.class,id);
		return emp;
	}
	
	@Transactional
	public String deleteEmpById(int id) {
		Employee emp = this.hibernateTemplate.get(Employee.class,id);
	   this.hibernateTemplate.delete(emp);
	   return "Data Deleted Successfully";
	}
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
