package com.altindal.SpringJPA.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altindal.SpringJPA.controller.IStudentController;
import com.altindal.SpringJPA.dto.StudentDTO;
import com.altindal.SpringJPA.dto.StudentDTOUI;
import com.altindal.SpringJPA.entitites.Student;
import com.altindal.SpringJPA.services.IStudentService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/student")
public class StudentController implements IStudentController {

	@Autowired
	private IStudentService studentService;
	
	//Genelde DTO kullanılır.
	@PostMapping(path="/save")
	@Override
	public StudentDTO saveStudent(@RequestBody @Valid StudentDTOUI studentDTOUI) {
		return studentService.saveStudent(studentDTOUI);
	}

	@GetMapping(path="/list")
	@Override
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping(path = "/list/{id}")
	@Override
	public Student getStudentById(@PathVariable(name="id") Integer id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping(path = "/delete/{id}")
	@Override
	public void deleteStudentById(@PathVariable(name="id") Integer id) {
		 studentService.deleteStudentById(id);		
	}

	@PutMapping(path = "/update/{id}")
	@Override
	public Student updateStudent(@PathVariable(name="id") Integer id,@RequestBody Student updateStudent) {
		return studentService.updateStudent(id, updateStudent);
	}

}