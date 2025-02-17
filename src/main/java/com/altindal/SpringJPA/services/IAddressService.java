package com.altindal.SpringJPA.services;

import com.altindal.SpringJPA.dto.AddressDTO;

public interface IAddressService {

	public AddressDTO findAddressById(Long id);
}
