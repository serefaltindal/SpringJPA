package com.altindal.SpringJPA.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altindal.SpringJPA.dto.HomeDTO;
import com.altindal.SpringJPA.dto.RoomDTO;
import com.altindal.SpringJPA.entitites.Home;
import com.altindal.SpringJPA.entitites.Room;
import com.altindal.SpringJPA.repository.HomeRepository;
import com.altindal.SpringJPA.services.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService{

	@Autowired
	HomeRepository homeRepository;
	
	@Override
	public HomeDTO findHomeById(Long id) {
		Optional<Home> homeOpt=homeRepository.findById(id);
		
		Home home=homeOpt.get();
		List<Room> rooms=home.getRooms();		
		HomeDTO responseHomeDTO=new HomeDTO();
		
		BeanUtils.copyProperties(home, responseHomeDTO);
		if(rooms!=null && !rooms.isEmpty()) {
			List<RoomDTO> roomDtoList=rooms.stream().map(room->{
				RoomDTO roomDTO=new RoomDTO();
				BeanUtils.copyProperties(room,roomDTO);
				return roomDTO;
			}).collect(Collectors.toList());
			responseHomeDTO.setRooms(roomDtoList);
		}
		return responseHomeDTO;
	}

	
}
