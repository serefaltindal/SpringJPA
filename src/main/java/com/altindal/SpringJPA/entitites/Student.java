package com.altindal.SpringJPA.entitites;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="first_name",nullable = false)
	private String firstName;

	@Column(name="last_name",nullable = false)
	private String lastName;

	@Column(name="birth_of_date",nullable = true)
	private Date birthOfDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthOfDate() {
		return birthOfDate;
	}
	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	
	
}
