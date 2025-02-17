package com.altindal.SpringJPA.dto;

import java.math.BigDecimal;
import java.util.List;

import com.altindal.SpringJPA.entitites.Room;

public class HomeDTO {

	private Long id;
	
	private BigDecimal price;

	private List<RoomDTO> room;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<RoomDTO> getRooms() {
		return room;
	}

	public void setRooms(List<RoomDTO> room) {
		this.room = room;
	}
	
	
}
