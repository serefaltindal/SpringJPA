package com.altindal.SpringJPA.services;

import com.altindal.SpringJPA.dto.CustomerDTO;

public interface ICustomerService {

	public CustomerDTO findCustomerById(Long id);
}	
