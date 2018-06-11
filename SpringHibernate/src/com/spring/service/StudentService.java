package com.spring.service;

import com.spring.model.Student;

public interface StudentService {
  public abstract void addStudent(Student student);
  public abstract Student getStudentById(int stuId);
}
