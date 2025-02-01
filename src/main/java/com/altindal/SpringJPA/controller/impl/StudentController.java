package com.altindal.SpringJPA.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altindal.SpringJPA.controller.IStudentController;
import com.altindal.SpringJPA.entitites.Student;
import com.altindal.SpringJPA.services.IStudentService;


@RestController
@RequestMapping("/api/student")
public class StudentController implements IStudentController {

	@Autowired
	private IStudentService studentService;
	
	//Genelde DTO kullanılır.
	@PostMapping(path="/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

}
