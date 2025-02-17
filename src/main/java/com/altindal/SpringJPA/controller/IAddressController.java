package com.altindal.SpringJPA.controller;

import com.altindal.SpringJPA.dto.AddressDTO;

public interface IAddressController {

	public AddressDTO findAddressById(Long id);
}
