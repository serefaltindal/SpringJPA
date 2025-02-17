package com.altindal.SpringJPA.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altindal.SpringJPA.controller.IAddressController;
import com.altindal.SpringJPA.dto.AddressDTO;
import com.altindal.SpringJPA.services.impl.AddressService;

@RestController
@RequestMapping("rest/api/address")
public class AddressController implements IAddressController {

	@Autowired
	AddressService addressService;
	
	@GetMapping(path="list/{id}")
	@Override
	public AddressDTO findAddressById(@PathVariable(name="id") Long id) {
		return addressService.findAddressById(id);
	}
	
}
