package com.venebel.smstool.database.dao;

import java.util.List;

import com.venebel.smstool.database.Student;

public interface StudentDAO {

    public List<Student> listStudents();
	public void addStudent(Student student);
    public void updateStudent(Student student);
    public void removeStudent(int id);
    public Student getStudentById(int id);
	
}
