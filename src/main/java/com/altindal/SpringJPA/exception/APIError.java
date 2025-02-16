package com.altindal.SpringJPA.exception;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class APIError {
	
	private String id;
	private Date errorTimeDate;
	private Map<String, List<String>> errors;
	

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


	public Map<String, List<String>> getErrors() {
		return errors;
	}


	public void setErrors(Map<String, List<String>> errors) {
		this.errors = errors;
	}
	
	

}
