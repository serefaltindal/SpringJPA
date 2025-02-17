package com.altindal.SpringJPA.exception;

import java.util.Date;

public class APIError<T> {
	
	private String id;
	private Date errorTimeDate;
	private T errors;
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Date getErrorTimeDate() {
		return errorTimeDate;
	}


	public void setErrorTimeDate(Date errorTimeDate) {
		this.errorTimeDate = errorTimeDate;
	}


	public T getErrors() {
		return errors;
	}


	public void setErrors(T errors) {
		this.errors = errors;
	}
	
	

}
