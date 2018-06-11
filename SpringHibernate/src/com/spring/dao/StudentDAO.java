package com.spring.dao;

import com.spring.model.Student;

public interface StudentDAO {
  public abstract void addStudent(Student student);
  public abstract Student getStudentById(int stuId);
}
