package com.altindal.SpringJPA.dto;

public class CustomerDTO {

	private Long id;
	
	private String name;
	
	private AddressDTO adressDTO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressDTO getAdressDTO() {
		return adressDTO;
	}

	public void setAdressDTO(AddressDTO adressDTO) {
		this.adressDTO = adressDTO;
	}
	
}
