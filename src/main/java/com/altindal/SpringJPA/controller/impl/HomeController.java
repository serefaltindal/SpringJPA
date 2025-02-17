package com.altindal.SpringJPA.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altindal.SpringJPA.controller.IHomeController;
import com.altindal.SpringJPA.dto.HomeDTO;
import com.altindal.SpringJPA.services.IHomeService;

@RestController
@RequestMapping(path="rest/api/home")
public class HomeController implements IHomeController {

	@Autowired
	IHomeService homeService;
	
	@GetMapping(path="list/{id}")
	@Override
	public HomeDTO findHomeById(@PathVariable Long id) {
		return homeService.findHomeById(id);
	}

}
