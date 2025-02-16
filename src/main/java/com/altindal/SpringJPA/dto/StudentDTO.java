package com.altindal.SpringJPA.dto;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

	private String firstName;
	
	private String lastName;
	
	private Date birthOfDate;
}
