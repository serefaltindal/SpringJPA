package com.altindal.SpringJPA.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altindal.SpringJPA.dto.AddressDTO;
import com.altindal.SpringJPA.dto.CustomerDTO;
import com.altindal.SpringJPA.entitites.Address;
import com.altindal.SpringJPA.entitites.Customer;
import com.altindal.SpringJPA.repository.CustomerRepository;
import com.altindal.SpringJPA.services.ICustomerService;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public CustomerDTO findCustomerById(Long id) {
		Optional<Customer> optional=customerRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		
		Customer customer=optional.get();
		Address address=optional.get().getAddress();
		
		CustomerDTO responseDto=new CustomerDTO();
		AddressDTO addressDto=new AddressDTO();
	  
		BeanUtils.copyProperties(customer, responseDto);
		BeanUtils.copyProperties(address, addressDto);
		
		responseDto.setAdressDTO(addressDto);
		
		return responseDto;
	}

}
