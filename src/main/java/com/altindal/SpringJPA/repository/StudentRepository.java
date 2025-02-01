package com.altindal.SpringJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altindal.SpringJPA.entitites.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
