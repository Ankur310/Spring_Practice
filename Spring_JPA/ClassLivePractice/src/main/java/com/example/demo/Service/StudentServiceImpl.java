package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exceptions.StudentException;
import com.example.demo.Model.Student;
import com.example.demo.Repositry.StudentDAO;



@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO sDao;
	
	@Override
	public Student saveStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return sDao.save(student);
	}

	@Override
	public Student getStudentById(Integer roll) {
		
		Optional<Student> opt = sDao.findById(roll);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			throw new StudentException("Student of this Roll no. isn't available");
		}
	}

	@Override
	public List<Student> getAllStudents() {
		
		return sDao.findAll();
	}

	@Override
	public Student deleteStudentByRoll(Integer roll) {
		Optional<Student> opt = sDao.findById(roll);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			throw new StudentException("Student not found with this roll no.");
		}
	}

}
