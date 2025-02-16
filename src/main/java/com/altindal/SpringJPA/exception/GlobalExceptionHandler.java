package com.altindal.SpringJPA.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	private List<String> addMapValueToList(List<String> list,String value){
		if(list!=null) {
			list.add(value);
		}
		return list;
	}
	
	@ExceptionHandler(value=MethodArgumentNotValidException.class)
	public ResponseEntity<APIError> handlerMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		Map<String,List<String>> errMap=new HashMap<>();
		
		for (ObjectError objError: ex.getAllErrors()) {
			
			String fieldName=((FieldError) objError).getField();
			String fieldError=((FieldError) objError).getDefaultMessage();
			if(errMap.containsKey(fieldName)) {
				errMap.put(fieldName, addMapValueToList(errMap.get(fieldName), fieldError));
			}else {
				errMap.put(fieldName, addMapValueToList(new ArrayList<String>(), fieldError));
			}
		}
		
		return ResponseEntity.badRequest().body(createApiError(errMap));
	}
	
	private APIError createApiError(Map<String, List<String>> errors) {
		APIError apiError=new APIError();
		apiError.setId(UUID.randomUUID().toString());
		apiError.setErrorTimeDate(new Date());
		apiError.setErrors(errors);		
		return apiError;
	}

}
