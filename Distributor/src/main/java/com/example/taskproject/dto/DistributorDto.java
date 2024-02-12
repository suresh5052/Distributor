package com.example.taskproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistributorDto {

	private String distributorName;
	
	private String DOB;

	private String Gender;
	
	private String Email;

	private String PhoneNumber;
	
}
