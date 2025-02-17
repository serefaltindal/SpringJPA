package com.altindal.SpringJPA.controller;

import com.altindal.SpringJPA.dto.HomeDTO;

public interface IHomeController {

	public HomeDTO findHomeById(Long id);
}
