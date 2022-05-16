package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentserivce;

	@PostMapping("/students")
	public Student saveStudentHandler(@RequestBody Student student) {
		return studentserivce.saveStudentDetails(student);
	}
	
	@GetMapping("/students/{roll}")
	public Student getStudentHandler(@PathVariable("roll") Integer roll) {
		return studentserivce.getStudentById(roll);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudentsHandler(){
		
		return studentserivce.getAllStudents();
	}
	
	@DeleteMapping("/students/{roll}")
	public ResponseEntity<Student> deleteStudentByRoll(@PathVariable("roll") Integer roll){
		Student std = studentserivce.deleteStudentByRoll(roll);
		return new ResponseEntity<>(std, HttpStatus.OK); 
	}
	
}
