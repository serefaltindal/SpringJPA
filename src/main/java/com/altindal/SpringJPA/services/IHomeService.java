package com.altindal.SpringJPA.services;

import com.altindal.SpringJPA.dto.HomeDTO;

public interface IHomeService {

	public HomeDTO findHomeById(Long id);
}
