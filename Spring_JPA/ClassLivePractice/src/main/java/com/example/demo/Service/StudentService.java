package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Student;


public interface StudentService {

	public Student saveStudentDetails(Student student);
	
	public Student getStudentById(Integer roll);
	
	public List<Student> getAllStudents();
	
	public Student deleteStudentByRoll(Integer roll);
	
}
