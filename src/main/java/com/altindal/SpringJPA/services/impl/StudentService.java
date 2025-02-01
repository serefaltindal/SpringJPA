package com.altindal.SpringJPA.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altindal.SpringJPA.entitites.Student;
import com.altindal.SpringJPA.repository.StudentRepository;
import com.altindal.SpringJPA.services.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);	
	}

}
