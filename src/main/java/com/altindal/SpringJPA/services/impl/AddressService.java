package com.altindal.SpringJPA.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altindal.SpringJPA.dto.AddressDTO;
import com.altindal.SpringJPA.dto.CustomerDTO;
import com.altindal.SpringJPA.entitites.Address;
import com.altindal.SpringJPA.entitites.Customer;
import com.altindal.SpringJPA.repository.AddressRepository;
import com.altindal.SpringJPA.services.IAddressService;

@Service
public class AddressService implements IAddressService {

	@Autowired
	AddressRepository addressRepository;
	
	@Override
	public AddressDTO findAddressById(Long id) {
		
		Optional<Address> addressOptional= addressRepository.findById(id);
		
		AddressDTO adressDTO=new AddressDTO();
		CustomerDTO consumerDTO=new CustomerDTO();
		
		Address  address= addressOptional.get();
		Customer customer=address.getCustomer();
		
		BeanUtils.copyProperties(address,adressDTO);
		BeanUtils.copyProperties(customer,consumerDTO);
		
		adressDTO.setCustomerDTO(consumerDTO);
		
		return adressDTO;
	}

}
