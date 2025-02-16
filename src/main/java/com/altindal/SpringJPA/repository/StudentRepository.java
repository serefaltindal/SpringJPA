package com.altindal.SpringJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.altindal.SpringJPA.entitites.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	/*Query anatasyonunun çalışma mantığı*/
	@Query(value="from Student", nativeQuery = false)
	List<Student> findAllStudents();

}
