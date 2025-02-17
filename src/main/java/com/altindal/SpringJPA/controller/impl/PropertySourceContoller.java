package com.altindal.SpringJPA.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altindal.SpringJPA.configurations.GlobalProperties;

@RestController
@RequestMapping(path="rest/api/property")
public class PropertySourceContoller {

	@Autowired
	private GlobalProperties globalProperties;
	
	@GetMapping("/datasource")
	public String getDataSource() {
		
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("Url: "+globalProperties.getUrl()).append(System.lineSeparator());
		stringBuilder.append("Username: "+globalProperties.getUsername()).append(System.lineSeparator());
		stringBuilder.append("Password: "+globalProperties.getPassword());
		
		return stringBuilder.toString();
	}
}
