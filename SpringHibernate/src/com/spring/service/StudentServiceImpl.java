package com.spring.service;

import com.spring.dao.StudentDAO;
import com.spring.model.Student;

public class StudentServiceImpl implements StudentService {
    
	private StudentDAO studentDAO;
	
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public void addStudent(Student student) {
		studentDAO.addStudent(student);
	}

	@Override
	public Student getStudentById(int stuId) {
		return studentDAO.getStudentById(stuId);
	}
}
