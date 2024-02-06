package com.irs.springbootmapstructexample.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CustomerGetDto {

	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("surname")
	private String surname;
}
