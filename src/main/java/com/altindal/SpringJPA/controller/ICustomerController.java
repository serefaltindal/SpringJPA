package com.altindal.SpringJPA.controller;

import com.altindal.SpringJPA.dto.CustomerDTO;

public interface ICustomerController {
	
	public CustomerDTO findCustomerById(Long id);
}
