package com.altindal.SpringJPA.services.impl;

import java.beans.beancontext.BeanContext;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altindal.SpringJPA.dto.StudentDTO;
import com.altindal.SpringJPA.dto.StudentDTOUI;
import com.altindal.SpringJPA.entitites.Student;
import com.altindal.SpringJPA.repository.StudentRepository;
import com.altindal.SpringJPA.services.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public StudentDTO saveStudent(StudentDTOUI studentDTOUI) {
		
		Student student=new Student();
		BeanUtils.copyProperties(studentDTOUI, student);
		student= studentRepository.save(student);
		StudentDTO studentDTO=new StudentDTO();
		BeanUtils.copyProperties(student,studentDTO);
		return studentDTO;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		Optional<Student> optional=studentRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
	
		return null;
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Student updateStudent(Integer id, Student updateStudent) {
		Student dbStudent=getStudentById(id);
		
		if(dbStudent!=null && updateStudent!=null) {
			dbStudent.setFirstName(updateStudent.getFirstName());
			dbStudent.setLastName(updateStudent.getLastName());
			dbStudent.setBirthOfDate(updateStudent.getBirthOfDate());
			return studentRepository.save(dbStudent);
		}
		// TODO Auto-generated method stub
		return null;
	}

}
