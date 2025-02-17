package com.altindal.SpringJPA.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altindal.SpringJPA.controller.ICustomerController;
import com.altindal.SpringJPA.dto.CustomerDTO;
import com.altindal.SpringJPA.services.impl.CustomerService;

@RestController
@RequestMapping("rest/api/customer")
public class CustomerController implements ICustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping(path="list/{id}")
	@Override
	public CustomerDTO findCustomerById(@PathVariable(name="id") Long id) {
		return customerService.findCustomerById(id);
	}

}
