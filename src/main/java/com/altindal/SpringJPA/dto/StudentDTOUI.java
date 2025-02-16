package com.altindal.SpringJPA.dto;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class StudentDTOUI {

	@Size(min=3,max = 20,message = "firstname min 5 karakter max 10 karakter olmalıdır")
	@NotEmpty(message = "firstName null olamaz")
	private String firstName;

	@Size(min=3,max = 20,message = "lastname min 5 karakter max 10 karakter olmalıdır")
	private String lastName;

	private Date birthOfDate;
	
	@Size(min = 11,max = 11,message = "TCKN Değeri 11 karakter olmalıdır.")
	private String tckn;
	
	@Email(message = "Email formatında olmalıdır.")
	private String email;

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

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
