package com.altindal.SpringJPA.services;

import java.util.List;

import com.altindal.SpringJPA.entitites.Student;


public interface IStudentService {

	public Student saveStudent(Student student);

	public List<Student> getAllStudents();
	
	public Student getStudentById(Integer id);
	
	public void deleteStudentById(Integer id);
	
	public Student updateStudent(Integer id,Student updateStudent);
}
